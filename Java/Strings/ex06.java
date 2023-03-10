import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        char letra;
        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();
        System.out.println("Digite uma letra para ser encontrada: ");
        letra = sc.nextLine().charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            if (frase.indexOf(letra) == -1) {
                System.out.println("\nEsta letra não existe na frase!\n");
                break;
            }else if (frase.charAt(i) == letra) {
                System.out.println("Letra " + "[" + letra + "]" + " na posição " + i);
            }
        }
        sc.close();
    }
}