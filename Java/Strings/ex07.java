import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int space=0;
        System.out.println("Digite o nome completo do usuário: ");
        nome = sc.nextLine();
        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == ' ') {
                space = i;
            }
        }
        String recorte = nome.substring(space+1, nome.length());
        System.out.println("\nSobrenome: " + recorte + "\n");
        sc.close();
    }
}