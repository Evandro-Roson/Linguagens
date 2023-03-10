import java.util.Scanner;

public class exec05_PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, pesoIdeal = 0.0;
        char sexo;     
        System.out.println("Digite a altura: ");
        altura = sc.nextDouble();
        System.out.println("Digite o gênero: ");
        sexo = sc.next().charAt(0);
        if (sexo == 'm' || sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58.0;
            System.out.println("Seu peso ideal é " + pesoIdeal + " KG");
        } else if (sexo == 'f' || sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é " + pesoIdeal + " KG");
        } else {
            System.out.println("ERRO!!!");
        }
        sc.close();
    }
}
