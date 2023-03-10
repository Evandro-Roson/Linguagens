import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0, par=0, impar=0;
        System.out.println("Digite a quantidade de posições no vetor: ");
        x = sc.nextInt();
        int vet[] = new int[x];
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Número " + (i+1) + ": ");
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0) {
                par ++;
            } else {
                impar ++;
            }
        }
        System.out.println("\nA quantidade de números pares é: " + par + "\nA quantidade de números ímpares é: " + impar);
        sc.close();
    }
}