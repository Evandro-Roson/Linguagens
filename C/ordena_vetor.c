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

int main()
{
    int t, i;
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
    fflush(stdin); getchar();
    return 0;
}
