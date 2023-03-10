import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int contV=0, contE=0;
        System.out.println("Digite o nome do usuário: ");
        nome = sc.nextLine();
        System.out.println("\nLetras do nome digitado: ");
        for (int i = 0; i < nome.length(); i++) {
            System.out.println("\n" + nome.charAt(i));
            if (nome.toLowerCase().charAt(i) == 'a' || nome.toLowerCase().charAt(i) == 'e' || nome.toLowerCase().charAt(i) == 'i' || nome.toLowerCase().charAt(i) == 'o' || nome.toLowerCase().charAt(i) == 'u') {
                contV++;
            }
            if (nome.toLowerCase().charAt(i) == ' ') {
                contE++;
            }
        }
        System.out.println("\nA quantidade de vogais é de: " + contV + "\nA quantidade de espaços é de: " + contE + "\n");
        sc.close();
    }
}