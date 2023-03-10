#include <stdio.h>

int sequencia(int v) {
	int a;
	if (v==1) a = 3;
	else a = 2 * sequencia(v-1) - 1;
	printf("%d\t", a);
	return a;
}

main (){
	int n, resultado;
	do{
	printf("\nDigite a n-esima posicao da sequencia: ");
	scanf("%d",&n);
	}while(n<=0);
	resultado = sequencia(n);
	printf("\nO resultado e = %d", resultado);
}
