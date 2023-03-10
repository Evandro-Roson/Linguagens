import java.util.Scanner;
public class ex01 {
    static int somaV(int[] v) {
        int soma=0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }
    public static void main(String[] args) {
        int quantE,soma=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite a quantidade de elementos do vetor: ");
        quantE = sc.nextInt();
        int vet[] = new int [quantE];
        System.out.println("\nPreencha os elementos do vetor: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        soma = somaV(vet);
        System.out.println("\n\nA soma dos elementos do vetor é: " + soma + "\n\n");
        sc.close();
    }
}