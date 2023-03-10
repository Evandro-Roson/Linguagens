import java.util.Arrays;
import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char mat[][] = new char[5][5];
        char letra;
        int cont=0;
        System.out.println("\nPreencha a matriz: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Linha " + (i+1));
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Coluna " + (j+1));
                mat[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println("\nDigite letra a ser encontrada: ");
        letra = sc.next().charAt(0);
        System.out.println("\nA letra " + letra + " foi encontrada nos seguintes índices: \n");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (letra == mat[i][j]) {
                    System.out.println("[" + i + "]" + "[" + j + "]");
                    cont++;
                }
            }
        }
        if (cont == 0) {
            System.out.println("\nNão existe letra " + letra + " na matriz.");
        }
        System.out.println("\n"+Arrays.deepToString(mat));
        sc.close();
    }
}