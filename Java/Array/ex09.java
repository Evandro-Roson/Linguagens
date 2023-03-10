import java.util.Arrays;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vetOrig[] = new double[10];
        double vetCopy[] = new double[3];
        int index = 0;
        System.out.println("\nPreencha os elementos do vetor: ");
        for (int i = 0; i < vetOrig.length; i++) {
            System.out.println("valor " + (i+1));
            vetOrig[i] = sc.nextDouble();
        }
        do {
            System.out.println("\nDigite um valor de índice menor ou igual a 7: ");
            index = sc.nextInt();
        } while (index > 7 || index < 0);
        System.arraycopy(vetOrig, index, vetCopy, 0, vetCopy.length);
        System.out.println("\nVetor original: " + Arrays.toString(vetOrig) + "\nÍndice escolhido: " + index + "\nVetor cópia: " + Arrays.toString(vetCopy) + "\n");
        sc.close();
    }
}