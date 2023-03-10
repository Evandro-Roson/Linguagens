import java.util.Scanner;
public class exec01_raio_esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, a, c, v;
        final double pi = 3.1415;
        System.out.println("Digite o raio da esfera = ");
        r = sc.nextDouble();
        c = 2 * pi * r;
        a = pi * (r * r);
        v = (3.0/4.0) * pi * (Math.pow(r, 3));
        System.out.println("O comprimento é de = " + c);
        System.out.println("A área da esfera é de : " + a);
        System.out.println("O volume da esfera é de : " + v);
        sc.close();
    }
}