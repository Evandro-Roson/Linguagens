#include <stdio.h>
#include <malloc.h>

typedef struct temp {
	int chave;
	struct temp *prox;
	struct temp *ant;
}listaDE;

listaDE *inicio, *novo, *aux;
int q;

void inserir (int v, int p) {
	int i;
	if (p <= 0 || p > q+1){
		printf("\nPosicao invalida!\n\n");
		return;
	}
	novo = (listaDE *) malloc (sizeof(listaDE));
	novo->chave = v;
	q++;
	if(inicio == NULL) {
		inicio = novo;
		inicio->prox = inicio->ant = NULL;
		return;
	}
	if (p == 1) {
		inicio->ant = novo;
		novo->ant = NULL;
		novo->prox = inicio;
		inicio = novo;
		return;
	}
	aux = inicio;
	for (i=1; i< p-1; i++) aux = aux->prox;
	if(aux->prox == NULL) {
		novo->prox = NULL;
		aux->prox = novo;
		novo->ant = aux;
		return;
	}
	novo->prox = aux->prox;
	novo->ant = aux;
	novo->prox->ant = novo;
	aux->prox = novo;
}

void mostrar() {
	if(inicio == NULL) {
		printf("\nLista Vazia\n\n");
		return;
	}
	printf("\nNULL -> ");
	aux = inicio;
	while (1) {
		if(aux->prox != NULL) {
			printf("%d -> ", aux->chave);
			aux = aux->prox;
		}else {
			printf("%d -> ", aux->chave);
			break;
		}
	}
	printf("NULL\n\nNULL <- ");
	while (1) {
		if(aux->ant != NULL) {
			printf("%d <- ", aux->chave);
			aux = aux->ant;
		}else {
			printf("%d <- ", aux->chave);
			break;
		}
	}
	printf("NULL\n\n");
}

void apagar(int p) {
	int i;
	if(inicio == NULL) {
		printf("\nLista Vazia\n\n");
		return;
	}
	if(p <= 0 || p > q) {
		printf("\nPosicao Invalida\n\n");
		return;
	}
	if(p == 1) {
		if (inicio->prox == NULL) {
			inicio = NULL;
			q--;
			return;
		}
		aux = inicio;
		inicio = aux->prox;
		inicio->ant = NULL;
		aux->prox = NULL;
		free(aux);
		q--;
		return;
	}
	if(p == q) {
		aux = inicio;
		for (i=1; i< p-1; i++) aux = aux->prox;
		aux->prox->ant = NULL;
		aux->prox = NULL;
		q--;
		return;
	}
	aux = inicio;
	for (i=1; i< p-1; i++) aux = aux->prox;
	aux->prox->ant = NULL;
	aux->prox->prox->ant = aux;
	novo = aux->prox;
	aux->prox = aux->prox->prox;
	novo->prox = NULL;
	q--;
	free(novo);
}

main() {
	int c = 0, v=0, p=0;
	q = 0; inicio = NULL;
	while(c != 4) {
		do {
		printf("\n----------Menu----------\n1 - Inserir.\n2 - Apagar.\n3 - Mostrar.\n4 - Sair.\n");
		scanf("%d", &c);
		}while (c <= 0 || c > 4);
		switch(c) {
			case 1:
				printf("\nDigite o valor para alocar: ");
				scanf("%d", &v);
				do {
					printf("\nDigite o indice para alocar: ");
					scanf("%d", &p);
				}while(p <= 0);
				inserir(v, p);
			break;
			case 2:
				do {
					printf("\nDigite o indice para apagar: ");
					scanf("%d", &p);
				}while(p <= 0);
				apagar(p);
			break;
			case 3:
				fflush(stdin);
				mostrar();
			break;
		}
	}
}
