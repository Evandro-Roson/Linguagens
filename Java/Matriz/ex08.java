import java.util.Arrays;
import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat1[][] = new int[4][4];
        int mat2[][] = new int[4][4];
        int matSoma[][] = new int[4][4];
        System.out.println("\nPreencha a matriz A: ");
        for (int i = 0; i < mat1.length; i++) {
            System.out.println("Linha " + (i+1));
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.println("Coluna " + (j+1));
                mat1[i][j] = sc.nextInt();               
            }
        }
        System.out.println("\nPreencha a matriz B: ");
        for (int i = 0; i < mat2.length; i++) {
            System.out.println("Linha " + (i+1));
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.println("Coluna " + (j+1));
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matSoma.length; i++) {
            for (int j = 0; j < matSoma[i].length; j++) {
                matSoma[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("\nA soma da matriz A com a B é: " + Arrays.deepToString(matSoma) + "\n");
        sc.close();
    }
}