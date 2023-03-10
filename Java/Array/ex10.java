import java.util.Arrays;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int maior=0, menor=0;
        System.out.println("\nPreencha os elementos do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valor " + (i+1));
            vetor[i] = sc.nextInt();
            if (i == 0) {
                menor = vetor[i];
                maior = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            } else if (vetor[i] < menor){
                menor = vetor[i];
            }
        }
        sc.close();
        System.out.println("\nVetor preenchido: " + Arrays.toString(vetor) + "\nMaior valor: " + maior + "\nMenor valor: " + menor + "\n");
    }
}