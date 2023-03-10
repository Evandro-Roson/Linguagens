import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mat[][] = new double[10][5];
        double somaM[]= new double[10];
        double Mclasse = 0.0;
        String situacao[] = new String[10];
        System.out.println("\nPreencha as notas dos alunos: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println("\n\tAluno " + (i+1));
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Nota " + (j+1));
                mat[i][j] = sc.nextInt();
                somaM[i] += mat[i][j];
            }
        }
        for (int i = 0; i < somaM.length; i++) {
            somaM[i] = somaM[i] / 5;
            Mclasse += somaM[i];
            if (somaM[i] >= 6) {
                situacao[i] = "Aprovado";
            } else {
                situacao[i] = "Reprovado";
            }    
            System.out.println("\nA média do aluno " + (i+1) + " é igual a: " + somaM[i] + "\tSituação: " + situacao[i]);
        }
        System.out.println("\nA média da classe é: " + (Mclasse/10) + "\n");
        sc.close();
    }
}