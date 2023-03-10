#include <stdio.h>
#include <malloc.h>

typedef struct temp {
	int chave;
	struct temp *dir;
	struct temp *esq;
}abb;

abb *raiz, *aux, *novo;

void inserir (int c) {
	novo = (abb*) malloc (sizeof(abb));
	novo->dir = NULL;
	novo->esq = NULL;
	novo->chave = c;
	if (raiz == NULL) {
		raiz = novo;
		return;
	}
	aux = raiz;
	while(1) { // aux fica parado no "pai" do nó
		if (c > aux->chave) {
			if (aux->dir == NULL) break;
			else aux = aux->dir;
		} else {
			if (aux->esq == NULL) break;
			else aux = aux->esq;
		}
	}
	if (c > aux->chave) aux->dir = novo;
	else aux->esq = novo;
}

void imprimeNO (int c, int b) {
	int i;
	for (i=0; i<b; i++) printf("   ");//3 espaços
	if (c >= 0) printf("%d\n", c);
	else printf("*\n"); 
}

void mostrar (abb *a, int b) { // b é o nível
	if (a == NULL) {
		imprimeNO(-1, b);
		return;
	}
	mostrar (a->dir, b+1); 
	imprimeNO (a->chave, b);
	mostrar (a->esq, b+1);
	
}

void pre_ordem(abb *raiz) {
	printf("%d\t", raiz->chave);
	if (raiz->esq != NULL) pre_ordem(raiz->esq);
	if (raiz->dir != NULL) pre_ordem(raiz->dir);
}

void pos_ordem(abb *raiz) {
	if (raiz->esq != NULL) pos_ordem(raiz->esq);
	if (raiz->dir != NULL) pos_ordem(raiz->dir);
	printf("%d\t", raiz->chave);
}

void em_ordem(abb *raiz) {
	if (raiz->esq != NULL) em_ordem(raiz->esq);
	printf("%d\t", raiz->chave);
	if (raiz->dir != NULL) em_ordem(raiz->dir);
}

// EXCLUSAAAAAO

void exclui (int c, abb *aux) {
	abb *ant, *exc;
	ant = aux;
	if (aux == NULL) return;
	while (aux != NULL) { // encontra nó a ser excluido
		if (aux->chave == c) break;
		ant = aux;
		if (c > aux->chave) aux = aux->dir;
		else aux = aux->esq; 
	}
	printf("\nant = %d",ant->chave);
	printf("\naux = %d",aux->chave);
	fflush(stdin); getchar();
	if (aux == NULL) { // chave não encontrada
		printf("\nChave nao encontrada!");
		return;
	}
	if (aux->dir == NULL && aux->esq == NULL) { // exclusao de folhas
		if (aux->chave > ant->chave) ant->dir = NULL;
		else ant->esq = NULL;
		free (aux);
		return;
	}
	if (aux->esq != NULL) {
		exc = aux;
		ant = aux; 
		aux = aux->esq;
		if (aux->dir == NULL) {
			ant->chave = aux->chave;
			ant->esq = aux->esq;
			free(aux);
			return;
		}
		ant = aux;
		aux = aux->dir;
		while (aux->dir != NULL) {
			ant = aux;
			aux = aux->dir;
		}
		exc->chave = aux->chave;
		ant->dir = aux->esq;
		free(aux);
	}
	else {
		exc = aux;
		ant = aux; 
		aux = aux->dir;
		if (aux->esq == NULL) {
			ant->chave = aux->chave;
			ant->dir = aux->dir;
			free(aux);
			return;
		}
		ant = aux;
		aux = aux->esq;
		while (aux->esq != NULL) {
			ant = aux;
			aux = aux->esq;
		}
		exc->chave = aux->chave;
		ant->esq = aux->dir;
		free(aux);	
	}
}

main() {
	raiz = NULL;
	int c = 0, v=0;
	while(c != 7) {
		do {
		printf("\n----------Menu----------\n1 - Inserir.\n2 - Mostrar.\n3 - Percurso pre ordem.\n4 - Percurso pos ordem.\n5 - Percurso ordem.\n6 - Excluir.\n7 - Sair.");
		scanf("%d", &c);
		}while (c <= 0 || c > 7);
		switch(c) {
			case 1:
				printf("\nDigite o valor para inserir: ");
				scanf("%d", &v);
				inserir(v);
			break;
			case 2:
				fflush(stdin);
				mostrar(raiz, 0);
			break;
			case 3:
				pre_ordem(raiz);
			break;
			case 4:
				pos_ordem(raiz);  
			break; 
			case 5:
				em_ordem(raiz); 
			break;
			case 6:
				printf("\nDigite o valor para excluir: ");
				scanf("%d", &v);
				exclui(v,raiz); 
			break;
		}
	}
}
