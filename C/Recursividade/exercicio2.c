#include <stdio.h>

int fibo(int n) {
	if (n==1 || n==2) return 1;
	return fibo(n-1) + fibo(n-2);
}

main (){
	int n, resultado, i;
	char loop= 's';
	while (loop == 's') {
		do{
			printf("\nDigite a n-esima posicao do fibonacci: ");
			scanf("%d",&n);
		}while(n<=0);
		resultado = fibo(n);
		for (i = 1; i <= n; i++) {
	    	printf("%d\t", fibo(i));
	  	}
		printf("\nO resultado e = %d", resultado);
		printf("\nDeseja continuar? (s ou n) "); fflush(stdin);
		loop = getchar();
	}
}
