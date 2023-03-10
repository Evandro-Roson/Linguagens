import java.util.Scanner;
public class ex02 {
    static void somaM(double[][] m) {
        double soma=0.0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                soma += m[i][j];
            }
        }
        System.out.println("\n\nA soma dos elementos da matriz é: " + soma + "\n\n");
    }
    public static void main(String[] args) {
        int quantL,quantC;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite a quantidade de linhas da matriz: ");
        quantL = sc.nextInt();
        System.out.println("\nDigite a quantidade de colunas da matriz: ");
        quantC = sc.nextInt();
        double mat[][] = new double [quantL][quantC];
        System.out.println("\nPreencha os elementos da matriz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        somaM(mat);
        sc.close();
    }
}