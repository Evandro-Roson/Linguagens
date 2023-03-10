/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
void imprime_vetor(int v[] , int t) {
    int i; printf("\n");
    for (i=0;i<t;i++) printf("\t%d" , v[i]);
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
    fflush(stdin);
    getchar();
    return 0;
}
