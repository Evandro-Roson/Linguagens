import java.util.Arrays;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet_original[] = new int[5];
        int vet_copia[] = new int[5];
        for (int i = 0; i < vet_original.length; i++) {
            System.out.println("Valor " + (i+1) + ": ");
            vet_original[i] = sc.nextInt();
        }
        for (int i = vet_copia.length-1; i >= 0; i--) {
            vet_copia[i] = vet_original[vet_original.length-i-1];
        }
        System.out.println("\nOs valores na ordem original são: " + Arrays.toString(vet_original) + "\nOs valores na ordem invertida são: " + Arrays.toString(vet_copia) + "\n");
        sc.close();
    }
}