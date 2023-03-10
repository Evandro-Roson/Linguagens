import java.util.Arrays;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numerico;
        System.out.println("Digite um valor numérico: ");
        numerico = sc.nextLine();
        String extenso[] = new String[numerico.length()];
        for (int i = 0; i < numerico.length(); i++) {
            if (numerico.charAt(i) == '0') {
                extenso[i] = "zero";
            }else if (numerico.charAt(i) == '1') {
                extenso[i] = "um";
            }else if (numerico.charAt(i) == '2') {
                extenso[i] = "dois";
            }else if (numerico.charAt(i) == '3') {
                extenso[i] = "três";
            }else if (numerico.charAt(i) == '4') {
                extenso[i] = "quatro";
            }else if (numerico.charAt(i) == '5') {
                extenso[i] = "cinco";
            }else if (numerico.charAt(i) == '6') {
                extenso[i] = "seis";
            }else if (numerico.charAt(i) == '7') {
                extenso[i] = "sete";
            }else if (numerico.charAt(i) == '8') {
                extenso[i] = "oito";
            }else if (numerico.charAt(i) == '9') {
                extenso[i] = "nove";
            }
        }
        System.out.println("O valor digitado em extenso é: " + Arrays.toString(extenso) + "\n");
        sc.close();
    }
}