import java.util.Scanner;

public class exec02_prest_atraso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prest, valor, tempo, taxa;
        System.out.println("Escreva o valor total: ");
        valor = sc.nextDouble();
        System.out.println("Escreva o valor da taxa: ");
        taxa = sc.nextDouble();
        System.out.println("Escreva o tempo em meses: ");
        tempo = sc.nextDouble();
        prest = valor + (valor * (taxa/100) * tempo);
        System.out.println("O valor da prestação é de : " + prest);
        sc.close();
    }
}
