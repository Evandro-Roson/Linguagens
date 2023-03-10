import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][5];
        int soma=0;
        System.out.println("\nPreencha a matriz: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Linha " + (i+1));
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Coluna " + (j+1));
                mat[i][j] = sc.nextInt();
                soma += mat[i][j];
            }
        }
        System.out.println("\nA soma de todos os elementos da matriz é: " + soma + "\n");
        sc.close();
    }
}