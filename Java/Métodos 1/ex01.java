import java.util.Scanner;
public class ex01 {
    static void parImpar(int n) {
        if (n % 2 == 0) System.out.println("Número par!");
        else System.out.println("Número impar!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um número: ");
        n = sc.nextInt();
        parImpar(n);
        sc.close();
    }
}