import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "CP850");
        String nome;
        System.out.println("Digite o nome da disciplina: ");
        nome = sc.nextLine();
        nome = nome.toLowerCase();
        if (nome.startsWith("programação") || nome.endsWith("programação")) {
            System.out.println("\nÉ da categoria de Programação.\n");
        } else {
            System.out.println("\nNão é da categoria Programação.\n");
        }
        sc.close();
    }
}