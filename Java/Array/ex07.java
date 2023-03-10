import java.util.Arrays;
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet1[] = new int[8];
        int vet2[] = new int[8];
        System.out.println("\nPreencha os elementos do vetor: \n");
        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Valor " + (i+1));
            vet1[i] = sc.nextInt();
        }
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = vet1[vet1.length-i-1];
        }
        System.out.println("\nValores originais: " + Arrays.toString(vet1) + "\nValores invertidos: " + Arrays.toString(vet2));
        sc.close(); 
    }
}