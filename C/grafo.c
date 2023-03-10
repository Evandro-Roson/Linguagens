#include <stdio.h>

int main() {
	int v, o, d, a,i,j;
	do {
		printf("\nDigite a quantidade de vertices do grafo: ");
		scanf("%d", &v);
	}while(v <= 0);
	int m[v][v];
	for (i=0; i<v; i++) {
		for (j=0; j<v; j++){
			m[i][j] = 0;
		}
	}
	do {
		printf("\nDigite a quantidade de arestas do grafo: ");
		scanf("%d", &a);
	}while(a <= 0);
	for (i=0; i<a; i++){
		do {
			printf("\nDigite o vertice de origem: ");
			scanf("%d", &o);
			printf("\nDigite o vertice de destino: ");
			scanf("%d", &d);
		}while(o > v-1 || d > v-1 || o < 0 || d < 0);
		printf("\nDigite o tamanho da aresta dos vertices digitados: ");
		scanf("%d",&m[o][d]);
		m[d][o] = m[o][d];
	}
	
	for (i=0; i<v; i++) {
		printf("\n");
		for (j=0; j<=i; j++){
			printf("\t%d", m[i][j]);
		}
	}
	/*
	for (i=0; i<v; i++) {
		printf("\n");
		for (j=i+1; j<v; j++){
			printf("\t%d", m[i][j]);
		}
	}
	*/
	return 0;
}
