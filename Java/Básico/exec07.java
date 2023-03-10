import java.util.Scanner;

public class exec07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=1.0, soma=0.0;
        int c=0;
        while (n > 0.0) {
            System.out.println("Digite um valor: ");
            n = sc.nextDouble();
            if (n > 0.0) {
                c += 1;
                soma += n;
            }            
        }
        System.out.println("\nA soma dos valores positivos é: " + soma);
        System.out.println("\nA média dos valores positivos é: " + (soma/c));
        sc.close();
    }
}
