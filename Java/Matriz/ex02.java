import java.util.Arrays;
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];
        System.out.println("\nPreencha a matriz: ");
        for (int j = 0; j < 3; j++) {
            System.out.println("Coluna " + (j+1));
            for (int i = 0; i < mat.length; i++) {
                System.out.println("Linha " + (i+1));
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(mat));
        sc.close();
    }
}