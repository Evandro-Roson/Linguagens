import java.util.Scanner;
public class ex05 {
    static void calcSeg(int h) {
        int cont=0;
        cont += h * 3600;
        System.out.println("\n\nTotal em segundos: " + cont + "\n\n");
    }
    static void calcSeg(int h, int m) {
        int cont=0;
        cont += (h * 3600) + (m * 60);
        System.out.println("\n\nTotal em segundos: " + cont + "\n\n");
    }
    static void calcSeg(int h, int m, int s) {
        int cont=0;
        cont += (h * 3600) + (m * 60) + s;
        System.out.println("\n\nTotal em segundos: " + cont + "\n\n");
    }
    public static void main(String[] args) {
        int form, hora, min, seg;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite o formato desejado, de 1 a 3: ");
            form = sc.nextInt();    
        } while (form < 1 || form > 3);
        switch (form) {
            case 1:
                System.out.println("Digite as horas: ");
                hora = sc.nextInt();
                calcSeg(hora);
                break;
            case 2:
                System.out.println("Digite as horas: ");
                hora = sc.nextInt();
                System.out.println("Digite os minutos: ");
                min = sc.nextInt();
                calcSeg(hora,min);
                break;
            default:
                System.out.println("Digite as horas: ");
                hora = sc.nextInt();
                System.out.println("Digite os minutos: ");
                min = sc.nextInt();
                System.out.println("Digite os segundos: ");
                seg = sc.nextInt();
                calcSeg(hora,min,seg);
                break;
        }
        sc.close();
    }
}