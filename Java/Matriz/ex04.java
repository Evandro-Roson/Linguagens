import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][6];
        int maior=0, menor=0, maiorI=0, maiorJ=0, menorI=0, menorJ=0;
        System.out.println("\nPreencha a matriz: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Linha " + (i+1));
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Coluna " + (j+1));
                mat[i][j] = sc.nextInt();
                if (i == 0 && j == 0) {
                    maior = mat[i][j];
                    menor = mat[i][j];
                    maiorI = i;
                    maiorJ = j;
                    menorI = i;
                    menorJ = j;
                }
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                    maiorI = i;
                    maiorJ = j;
                }
                if (mat[i][j] < menor) {
                    menor = mat[i][j];
                    menorI = i;
                    menorJ = j;
                }
            }
        }
        System.out.println("\nO maior elemento da matriz é: " + maior + "\tPosição: " + "[" + maiorI + "]" + "[" + maiorJ + "]" + "\nO menor elemento da matriz é: " + menor + "\t\tPosição: " + "[" + menorI + "]" + "[" + menorJ + "]" + "\n");
        sc.close();
    }
}