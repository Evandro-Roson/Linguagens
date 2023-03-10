import java.util.Scanner;
public class ex04 {
    static void buscaV(int[] v, int n) {
        int cont=0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                System.out.println("\nValor " + n + " na posição " + i);
                cont++;
            }
        }
        if (cont == 0) System.out.println("\nEste valor não existe no vetor!");
    }
    public static void main(String[] args) {
        int quantE, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite a quantidade de elementos do vetor: ");
        quantE = sc.nextInt();
        int vet[] = new int [quantE];
        System.out.println("\nPreencha os elementos do vetor: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.println("\nDigite o valor a ser buscado: ");
        n = sc.nextInt();
        buscaV(vet, n);
        sc.close();
    }
}