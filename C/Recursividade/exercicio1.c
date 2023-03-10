#include <stdio.h>
#include <malloc.h>

int potencia(int a, int b){
	if(b == 0) return 1;
	else return a*potencia(a, (b-1));
}

main (){
	int a, b, resultado;
	printf("\nDigite o valor de a: ");
	scanf("%d",&a);
	printf("\nDigite o valor de b: ");
	scanf("%d",&b);
	resultado = potencia(a, b);
	printf("\nO resultado e = %d", resultado);
}
