import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String str;
        System.out.print("Digite um número: ");
        str = entrada.nextLine();
        try {
            num = Integer.parseInt(str);
            System.out.println("Num: "+num);
        } catch (NumberFormatException e) {
            System.err.println("Não é um número inteiro!");
        }
        entrada.close();
    }
}