import java.util.Scanner;
public class ex02 {
    static void calcImc(char s, double alt, double p){
        double imc = p / (alt * alt);
        System.out.println("IMC: " + imc);
        if (s == 'f') {
            if (imc < 19.1) System.out.println("Abaixo do peso.");
            else if (imc < 25.8) System.out.println("Peso normal.");
            else if (imc < 27.3) System.out.println("Marginalmente acima do peso");
            else if (imc < 31.1) System.out.println("Acima do peso ideal.");
            else System.out.println("Obeso.");
        } else if (s == 'm') {
            if (imc < 20.7) System.out.println("Abaixo do peso.");
            else if (imc < 26.4) System.out.println("Peso normal.");
            else if (imc < 27.8) System.out.println("Marginalmente acima do peso");
            else if (imc < 32.3) System.out.println("Acima do peso ideal.");
            else System.out.println("Obeso.");
        }
    }
    public static void main(String[] args) {
        String sexo;
        char s;
        double peso, altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o sexo (f ou m): ");
        sexo = sc.nextLine().toLowerCase();
        s = sexo.charAt(0);
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();
        sc.close();
        calcImc(s, altura, peso);
    }
}