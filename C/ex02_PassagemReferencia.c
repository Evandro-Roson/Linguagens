#include <stdio.h>
void imprime_vetor(int v[] , int t) {
    int i; printf("\n");
    for (i=0;i<t;i++) {
        printf("\t%d" , v[i]);
        v[i] += 10;
    }
    t+=10;
}
int main() {
    int n, i;
    do {
        printf("\nDigite o tamanho do vetor: ");
        scanf("%d",&n);
    } while (n<=0);
    int v[n];
    for (i = 0; i < n; i++) {
        printf("\nDigite o elemento %d : ", i);
        scanf("%d",&v[i]);
    }
    imprime_vetor(v,n);
    printf("\nNovos valores vetor: ");
    for (i = 0; i < n; i++) printf("\t%d", v[i]);
    printf("\nTamanho do vetor: ");
    printf("%d\n", n);
    fflush(stdin);
    getchar();
    return 0;
}
