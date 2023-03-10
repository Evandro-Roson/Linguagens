import java.util.Scanner;
public class ex01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, media;
        int num[] = new int[15]; 
        System.out.println("Digite os valores do vetor :");
        for (int i = 0; i < 15; i++) {
            num[i] = sc.nextInt();
            soma += num[i];
        }        
        media = soma / num.length;
        System.out.println("A soma dos valores é de: " + soma);
        System.out.println("A media dos valores é de: " + media);
        sc.close();
    }
}