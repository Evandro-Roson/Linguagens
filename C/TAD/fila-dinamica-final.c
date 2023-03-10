#include <stdio.h>
#include <malloc.h>

typedef struct temp {
	int chave;
	struct temp *prox;
}lista;

lista *start, *aux, *novo;
int q; //  inteiro global para controlar quantidade de elementos

void inserir(int c, int p) {
	int i=0;
	if (p<1 || p>q+1) {
		printf("\nErro de posicao! (%d)\n", p);
		return;
	}
	novo = (lista *) malloc (sizeof(lista)); 
	novo->chave = c; 
	novo->prox = NULL;
	q++;
	
	if (start == NULL) start = novo;
 	else if(p == 1) { // inserção no começo, igual a pilha
		novo->prox = start;
		start = novo;
	} else { // inserção no meio da lista (ou final)
		aux = start;
		for (i=1; i<=p-2; i++) aux = aux->prox;
		novo->prox = aux->prox;
		aux->prox = novo;
	}
}

void apagar(int p) {
	int i;
	if (p<1 || p>q) {
		printf("\nErro de posicao! (%d)\n", p);
		return;
	}else if(p == 1) {
		start = start->prox;
		q--;
	}else {
		aux = start;
		for (i=1; i<=p-2; i++) aux = aux->prox;
		novo = aux->prox;
		aux->prox = novo->prox;
		free(novo);
		q--;
	}
}



void mostrar() {
	printf("\n");
	if (start == NULL) {
		printf("\n\tLista vazia...\n");
		return;
	}
	aux = start;
	while (aux!= NULL) {
		printf("%d -> ", aux->chave);
		aux = aux->prox;
	}
	printf(" NULL\n");
}

main() {
	int v=0; 
	int i=0; 
	int c=0;
	start=NULL; q=0;// FILA COMEÇA VAZIA
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
					scanf("%d", &i);
				}while(i <= 0);
				inserir(v, i);
			break;
			case 2:
				i=0;
				do {
					printf("\nDigite o indice para apagar: ");
					scanf("%d", &i);
				}while(i <= 0);
				apagar(i);
			break;
			case 3:
				fflush(stdin);
				mostrar();
			break;
		}
	}
}
