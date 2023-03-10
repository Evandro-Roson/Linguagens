import java.util.Arrays;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mat[][] = new double[3][4];
        System.out.println("\nPreencha a matriz: ");
        for (int i = mat.length-1; i >= 0 ; i--) {
            System.out.println("Linha " + (i+1));
            for (int j = mat[i].length-1; j >= 0; j--) {
                System.out.println("Coluna " + (j+1));
                mat[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\n" + Arrays.deepToString(mat) + "\n");
        sc.close();
    }
}