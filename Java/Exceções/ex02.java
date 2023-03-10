import java.util.Scanner;
public class ex02 {
    static void imprimePosicao(int matriz[][], int indice_linha, int indice_coluna) {
        try {
            System.out.println("Valor na posição escolhida: " + matriz[indice_linha][indice_coluna]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Índice inválido!");
        }
    }
    public static void main(String[] args) {
        int iL,iC;
        Scanner sc = new Scanner(System.in);
        int mat[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        System.out.println("Digite o indice linha: ");
        iL = sc.nextInt();
        System.out.println("Digite o indice coluna: ");
        iC = sc.nextInt();
        imprimePosicao(mat, iL, iC);
        sc.close();
    }
}