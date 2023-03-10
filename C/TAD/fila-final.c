#include <stdio.h>
#include <malloc.h>

typedef struct temp {
	int chave;
	struct temp *prox;
}fila;

fila *inicio, *novo, *fim;

void enfilerar(int v) {
	novo = (fila *) malloc(sizeof(fila));
	novo->chave = v;
	novo->prox = NULL;
	if (inicio == NULL) inicio = novo;
	else fim->prox = novo;
	fim = novo;
}

void mostrar() {
	fila *aux = inicio;
	while (aux != NULL) {
		printf("\t%d ->", aux->chave);
		aux = aux->prox;
	}	
}

void desenfilerar() {
	fila *aux = inicio;
	inicio = aux->prox;
	free(aux);
}

main() {
	int c = 0;
	int v;
	while (c != 4) {
		do {
			printf("\n----------Menu----------\n1 - Enfilerar.\n2 - Desenfilerar.\n3 - Mostrar.\n4 - Sair.\n");
			scanf("%d", &c);
		}while (c <= 0);
		switch (c) {
			case 1:
				printf("\nQual valor deseja enfileirar? ");
				scanf("%d", &v);
				enfilerar(v);
				printf("\nValor %d foi enfileirado!", v);
			break;
			case 2:
				if (inicio == NULL) printf("\nFila esta vazia!");
				else {					
					printf("\nValor %d foi Desenfileirado",inicio->chave);
					desenfilerar();
				}
			break;
			case 3:
				mostrar();
			break;
		}	
	}
}
