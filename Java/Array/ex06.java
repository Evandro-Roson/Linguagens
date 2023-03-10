import java.util.Arrays;
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vet1[] = new double[3];
        double vet2[] = new double[3];
        double vet3[] = new double[6];
        double soma1 = 0.0, soma2 = 0.0;
        System.out.println("\nVetor 01: \n");
        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Valor " + (i+1));
            vet1[i] = sc.nextDouble();
            soma1 += vet1[i];
        }
        System.out.println("\nVetor 02: \n");
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("Valor " + (i+1));
            vet2[i] = sc.nextDouble();
            soma2 += vet2[i];
        }
        if (soma1 > soma2) {
            System.arraycopy(vet1, 0, vet3, 0, vet1.length);
            System.arraycopy(vet2, 0, vet3, 3, vet2.length);
        } else {
            System.arraycopy(vet1, 0, vet3, 3, vet1.length);
            System.arraycopy(vet2, 0, vet3, 0, vet2.length);
        }
        System.out.println("\n\nVetor 01: " + Arrays.toString(vet1) + "\tSoma: " + soma1 + "\nVetor 02: " + Arrays.toString(vet2) + "\tSoma: " + soma2 + "\nVetor Resultado: " + Arrays.toString(vet3));
        sc.close();
    }
}