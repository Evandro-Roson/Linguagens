import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];
        int somaP=0, somaS=0;
        int somaL[]= new int[3];
        int somaC[]= new int[3];
        System.out.println("\nPreencha a matriz: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println("\tLinha " + (i+1));
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Coluna " + (j+1));
                mat[i][j] = sc.nextInt();
                if (i == j) {
                    somaP += mat[i][j];
                }
                somaL[i] += mat[i][j];
                somaC[j] += mat[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            somaS += mat[i][mat[i].length-i-1];
        }
        System.out.println("\nA soma dos elementos da diagonal principal: " + somaP + "\nA soma dos elementos da diagonal secundária: " + somaS + "\nA soma dos elementos da linha 1: " + somaL[0] + "\nA soma dos elementos da linha 2: " + somaL[1] + "\nA soma dos elementos da linha 3: " + somaL[2] + "\nA soma dos elementos da coluna 1: " + somaC[0] + "\nA soma dos elementos da coluna 2: " + somaC[1] + "\nA soma dos elementos da coluna 3: " + somaC[2]);
        sc.close();
    }
}