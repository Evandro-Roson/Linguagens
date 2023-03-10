import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        int x=100, cont=0, contm=0, lastI=0;
        double soma=0.0, media=0.0, nota=0.0;
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[x];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira a nota " + (i+1) + ": ");
            nota = sc.nextDouble();
            if (nota != -1) {
                notas[i] = nota;
                cont++;
                soma += notas[i];
                lastI = i;
            } else {
                break;
            }
        }
        media = soma / cont;
        for (int i = 0; i <= lastI; i++) {
            if (media > notas[i]) {
                contm ++;
            }
        }
        System.out.println("\nA quantidade de valores lidos foi de: " + cont + "\n\nValores na ordem em que foram informados: \n");
        for (int i = 0; i <= lastI; i++) {
            System.out.println(notas[i]);
        }
        System.out.println("\nValores na ordem inversa: \n");
        for (int i = lastI; i >= 0; i--) {
            System.out.println(notas[i] + "\n");
        }
        System.out.println("\nA soma dos valores é: " + soma + "\nA média dos valores é: " + media + "\nA quantidade de valores acima da média é: " + contm + "\n");
        sc.close();
    }
}