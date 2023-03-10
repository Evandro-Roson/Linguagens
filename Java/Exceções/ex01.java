import java.util.InputMismatchException;
import java.util.Scanner;
public class ex01 {
    static void verificaOp(char op) throws Exception {
        if (op != '+' && op != '-' && op != '*' && op != '/') {
            throw new Exception("Operador inválido!");
        }
    }
    public static void main(String[] args) {
        char op='a';
        double num1=0,num2=0;
        Scanner sc = new Scanner(System.in, "latin1");
        try {
            System.out.println("Digite um número: ");
            num1 = sc.nextDouble();
            System.out.println("Digite outro número: ");
            num2 = sc.nextDouble();
            System.out.println("Digite o operador matemático: ");
            op = sc.next().charAt(0);
            verificaOp(op);
        } catch (InputMismatchException e1) {
            System.err.println("Número inválido\n");
        } catch (Exception e2) {
            System.err.println(e2 + "\n");
        }
        switch (op) {
            case '+':
                System.out.println("\nResultado: " + (num1 + num2));
            break;
            case '-':
                System.out.println("\nResultado: " + (num1 - num2));
            break;
            case '*':
                System.out.println("\nResultado: " + (num1 * num2));
            break;
            case '/':
                if (num2 == 0) {
                    System.err.println("Impossível dividir por zero!");
                } else {
                    System.out.println("\nResultado: " + (num1 / num2));
                }
            break;
        }
        sc.close();
    }
}