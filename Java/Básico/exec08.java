import java.util.Scanner;

public class exec08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor, a, b, c;
        System.out.println("Digite um número inteiro: ");
        a = sc.nextInt();
        System.out.println("Digite um número inteiro: ");
        b = sc.nextInt();
        if (b > a) {
            dividendo = b;
            divisor = a;
        } else {
            dividendo = a;
            divisor = b;
        }
        while (dividendo % divisor != 0) {
            c = (dividendo % divisor);
            dividendo = divisor;
            divisor = c;
        }
        System.out.println("O MDC é: " + divisor);
        sc.close();
    }
}
