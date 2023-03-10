#include <stdio.h>
void troca(int *x, int *y) {
    int aux = *x;
    *x = *y;
    *y = aux;
}

void bubble_sort (int a[], int t){
    int i, j;
    for (i=t-1; i>=0; i--) {
        for (j=0; j<i; j++) {
            if (a[j] > a[j+1]) troca(&a[j],&a[j+1]);
        }
    }
}

void imprime(int v[], int t) {
    int i;
    printf("\n");
    for (i = 0 ;i < t;i++) printf("%d\t",v[i]);
    printf("\n");
}

int busca_binaria(int a[], int t, int c){
    int li = 0, ls = t-1, m;
    while (0==0) {
        m = (li + ls)/2;
        if(c==a[m]) break;
        else if(c > a[m]) li = m + 1;
        else ls = m - 1;
        if (li > ls) break;
    }
    if (li > ls) return-1;
    else return m;
}

int main()
{
    int t, i, c;
    do {
        printf("\n Tamanho do vetor: ");
        scanf("%d", &t);
    }while(t<=0);
    int v[t];
    for (i=0;i<t;i++) {
        printf("\n Digite posicao %d = ", i);
        scanf("%d",&v[i]);
    }
    bubble_sort(v,t);
    imprime(v,t);
    printf("\nDigite a chave para busca = ");
    scanf("%d",&c);
    int b = busca_binaria(v,t,c);
    if (b == -1) printf("\nNão encontrado\n");
    else printf("%d na posição %d \n",c,b);
    fflush(stdin); getchar();
    return 0;
}

