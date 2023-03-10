import java.util.Scanner;
import java.util.Arrays;
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet1[] = new int[5];
        int vet2[] = new int[5];
        int vet3[] = new int[5];
        for (int j = 0; j < vet1.length; j++) {
            System.out.println("Digite os valores do 1° vetor:");
            vet1[j] = sc.nextInt();
        } 
        for (int v = 0; v < vet2.length; v++) {
            System.out.println("Digite os valores do 2° vetor:");
            vet2[v] = sc.nextInt();
        }
        for (int i = 0; i < vet3.length; i++) {
            vet3[i] = vet1[i] + vet2[i];
        }
        System.out.println(Arrays.toString(vet3));
        sc.close();
    }
}