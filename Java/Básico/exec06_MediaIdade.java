import java.util.Scanner;

/**
 * exec06_MediaIdade
 */
public class exec06_MediaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, maior=0, contMa=0, c;
        for (c = 1; c < 11; c++) {
            System.out.println("Digite a idade da pessoa " + c + ":");
            idade = sc.nextInt();
            if (idade >= 18) {
                maior += idade;
                contMa += 1;
            }
        }
        System.out.println("\nA quantidade de pessoas com mais de 18 anos é " + contMa);
        System.out.println("\nA média de idade para maior de 18 anos é de " + (maior / contMa));
        sc.close();
    }
}