import java.util.Arrays;
import java.util.Scanner;
public class ex05 {
    static void ordenaV(int[] v) { //selection sort
        for (int i = 0; i < v.length - 1; i++) {  
            int index = i;  
            for (int j = i + 1; j < v.length; j++) {  
                if (v[j] < v[index]) {  
                    index = j;  
                }  
            }  
            int menorN = v[index];   
            v[index] = v[i];  
            v[i] = menorN;  
        }  
        System.out.println("\nOs valores na ordem crescente são: " + Arrays.toString(v) + "\n");    
    }
    public static void main(String[] args) {
        int quantE;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite a quantidade de elementos do vetor: ");
        quantE = sc.nextInt();
        int vet[] = new int [quantE];
        System.out.println("\nPreencha os elementos do vetor: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        ordenaV(vet);
        sc.close();
    }
}