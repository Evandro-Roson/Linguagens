import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[2][4];
        int quantP=0, somaP=0;
        int vetP[] = new int[2];
        System.out.println("\nPreencha a matriz: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Linha " + (i+1));
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Coluna " + (j+1));
                mat[i][j] = sc.nextInt();
                if (mat[i][j] % 2 == 0) {
                    quantP++;
                    vetP[i]++;
                    somaP += mat[i][j];
                }
            }
        }
        System.out.println("\nElementos pares na linha 1: " + vetP[0] + "\nElementos pares na linha 2: " + vetP[1] + "\nA média dos elementos pares da matriz: " + (double)((double)somaP/(double)quantP) + "\n");
        sc.close();
    }
}