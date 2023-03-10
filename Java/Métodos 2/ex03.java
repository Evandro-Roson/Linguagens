import java.util.Scanner;
public class ex03 {
    static void somaM(double[][] m, double[] v) {
        double somaDP=0.0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) somaDP += m[i][j];
                v[i] += m[i][j];
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println("\nA soma da linha " + (i+1) + " é igual a: " + v[i]);
        }
        System.out.println("\nA soma da diagonal principal é: " + somaDP + "\n");
    }
    public static void main(String[] args) {
        int quantL,quantC;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite a quantidade de linhas da matriz: ");
        quantL = sc.nextInt();
        System.out.println("\nDigite a quantidade de colunas da matriz: ");
        quantC = sc.nextInt();
        double mat[][] = new double [quantL][quantC];
        double somaL[] = new double [quantL];
        System.out.println("\nPreencha os elementos da matriz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        somaM(mat, somaL);
        sc.close();
    }
}