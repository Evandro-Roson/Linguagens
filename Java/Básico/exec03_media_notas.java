import java.util.Scanner;

/**
 * exec03_media_notas
 */
public class exec03_media_notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.println("Escreva a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Escreva a segunda nota: ");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media < 4) {
            System.out.println("Reprovado");
        } else if (media < 7){ 
            System.out.println("Exame");
        } else {
            System.out.println("Aprovado");
        }
        sc.close();
    }
}