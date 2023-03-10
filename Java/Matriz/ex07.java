import java.util.Arrays;
import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];
        int matFinal[][] = new int[3][3];
        System.out.println("\nPreencha a matriz: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Linha " + (i+1));
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Coluna " + (j+1));
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                matFinal[i][j] = mat[mat.length-1-j][i];
            }
        }
        System.out.println("\n" + Arrays.deepToString(matFinal) + "\n");
        sc.close();
    }
}