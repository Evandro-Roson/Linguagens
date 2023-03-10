#include <stdio.h>
#include <malloc.h>

typedef struct temp {
	int chave;
	struct temp *prox;
}pilha;

pilha *topo, *novo;

void empilhar(int v) {
	novo = (pilha *) malloc(sizeof(pilha));
	novo->chave = v;
	if (topo==NULL) novo->prox = NULL;
	else novo->prox = topo;
	topo = novo;
}

void mostrar() {
	pilha *aux = topo;
	while (aux != NULL) {
		printf("\t%d ->", aux->chave);
		aux = aux->prox;
	}	
}

void desempilhar() {
	pilha *aux = topo;
	topo = aux->prox;
	free(aux);
}

main() {
	int c = 0;
	int v;
	while (c != 4) {
		do {
			printf("\n----------Menu----------\n1 - Empilhar.\n2 - Desempilhar.\n3 - Mostrar.\n4 - Sair.\n");
			scanf("%d", &c);
		}while (c <= 0);
		switch (c) {
			case 1:
				printf("\nQual valor deseja empilhar? ");
				scanf("%d", &v);
				empilhar(v);
				printf("\nValor %d foi empilhado!", v);
			break;
			case 2:
				if (topo == NULL) printf("\nPilha esta vazia!");
				else {					
					printf("\nValor %d foi Desempilhado",topo->chave);
					desempilhar();
				}
			break;
			case 3:
				mostrar();
			break;
		}	
	}
}
