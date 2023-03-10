import java.util.Scanner;

public class exec09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1=0,v2=0,v3=0,v4=0,vb=0,vn=0,voto=0;
        do {
            System.out.println("Digite seu voto: ");
            voto = sc.nextInt();
            if (voto > 6) {
                System.out.println("Voto inválido!");
            } else if (voto == 1) {
                v1 += 1;
            } else if (voto == 2) {
                v2 += 1;
            } else if (voto == 3) {
                v3 += 1;
            } else if (voto == 4) {
                v4 += 1;
            } else if (voto == 5) {
                vn += 1;
            } else if (voto == 6) {
                vb += 1;
            }
        } while (voto != 0);
        System.out.println("Votos do presidente 1: " + v1 + "\n" + "Votos do presidente 2: " + v2 + "\n" + "Votos do presidente 3: " + v3 + "\n" + "Votos do presidente 4: " + v4 + "\n" + "Votos nulos: " + vn + "\n" + "Votos brancos: " + vb + "\n");
        sc.close();
    }
}
