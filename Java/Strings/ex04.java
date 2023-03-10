import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1, word2;
        System.out.println("Digite a 1ª palavra: ");
        word1 = sc.nextLine();
        System.out.println("Digite a 2ª palavra: ");
        word2 = sc.nextLine();
        if (word1.length() == word2.length()) {
            System.out.println("\nAs palavras possuem o mesmo tamanho!");
            if (word1.compareToIgnoreCase(word2) == 0) {
                System.out.println("\nAs palavras são iguais ignorando a CASE!");
            } else {
                System.out.println("\nAs palavras NÃO são iguais ignorando a CASE!");
            }
            if (word1.compareTo(word2) == 0) {
                System.out.println("\nAs palavras são exatamente iguais!");
            } else {
                System.out.println("\nAs palavras NÃO são exatamente iguais!");
            }
        } else {
            System.out.println("\nAs palavras NÃO possuem o mesmo tamanho!");
        }
        sc.close();
    }
}