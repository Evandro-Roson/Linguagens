import java.util.Scanner;
public class exec10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int x=10,y=3;
        int cApro=0, CRepro=0;
        double mediamax=0.0,mediamin=10.0,mediageral=0.0;
        double alunos[][] = new double [x][y];
        String codigo[] = new String[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Digite o número da matrícula: ");
            alunos[i][0] = sc.nextInt();
            System.out.println("Digite sua frequência: ");
            alunos[i][1] = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite a nota " + (j+1) + ":");
                alunos[i][2] += sc.nextInt();
            }
            alunos[i][2] = alunos[i][2] / 3;
            mediageral += alunos[i][2];
            if (mediamax < alunos[i][2]) {
                mediamax = alunos[i][2];
            }
            if (mediamin > alunos[i][2]) {
                mediamin = alunos[i][2];
            }
            if (alunos[i][1] >= 75 && alunos[i][2] >= 6) {
                codigo[i] = "Aprovado!";
                cApro += 1;
            } else {
                codigo[i] = "Reprovado!";
                CRepro += 1;
            }
        }
        mediageral = mediageral / x;
        for (int i = 0; i < x; i++) {
            System.out.println("Aluno " + (i+1) + ":\n");
            System.out.println("Número da matrícula: " + (int)alunos[i][0] + "\tFrequência: " + alunos[i][1] + "\tMédia: " + alunos[i][2] + "\tCódigo: " + codigo[i] + "\n");
        }
        System.out.println("\nA maior média da turma é: " + mediamax + "\nA menor média da turma é: " + mediamin + "\nA média geral da turma é: " + mediageral + "\nNúmero de aprovados: " + cApro + "\nNúmero de reprovados: " + CRepro);
        sc.close();
    }
}