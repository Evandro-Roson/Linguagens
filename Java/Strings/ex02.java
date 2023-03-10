import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome do usuário: ");
        nome = sc.nextLine();
        System.out.println("\nLetras do nome digitado: ");
        for (int i = 0; i < nome.length(); i++) {
            System.out.println("\n" + nome.charAt(i));
        }
        sc.close();
    }
}