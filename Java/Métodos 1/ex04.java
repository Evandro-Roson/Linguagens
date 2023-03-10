import java.util.Scanner;
public class ex04 {
    static int fat(int n) {
        int result=0;
        if (n == 0 || n == 1) {
            result = 1;
        } else if (n > 1) {
            result = n;
            while (n > 1) {
                result = result * (n - 1);
                n--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, result;
        System.out.println("Digite um número e descubra seu fatorial: ");
        n = sc.nextInt();
        result = fat(n);
        if (result == 0) {
            System.out.println("\nNão é possível fatorar número negativo.\n");
        } else {
            System.out.println("\nO fatorial de " + n + " é igual a: " + result + "\n");
        }
        sc.close();
    }
}