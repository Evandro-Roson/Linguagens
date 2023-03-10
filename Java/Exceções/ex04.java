import java.util.InputMismatchException;
import java.util.Scanner;
public class ex04 {
    static double saque(double saque, double saldo) {
        double saldoF = saldo - saque;
        System.out.println("\nNovo saldo: " + saldoF);
        return saldoF;
    }
    static double deposita(double deposito, double saldo) {
        double saldoF = saldo + deposito;
        System.out.println("\nNovo saldo: " + saldoF);
        return saldoF;
    }
    static void verifica(double saldo) {
        System.out.println("\nSaldo atual: " + saldo);
    }
    static void erro(double saque, double saldo) throws Exception {
        if (saque > saldo) {
            throw new Exception("\nSaldo insuficiente!");
        }
        if (saque < 1) {
            throw new Exception("\nColoque apenas números positivos maiores ou iguais a 1 real!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo=1000.00, saque, deposita;
        char op = 'a';
        do {
            op = 'a';
            System.out.println("\nSelecione a operação: (1. Sacar, 2. Depositar, 3. Verificar saldo, 4. Sair)");
            op = sc.next().charAt(0);
            if (op != '1' && op != '2' && op != '3' && op != '4') {
                System.out.println("\nOperação inválida!");
            }
            switch (op) {
                case '1':
                    try {
                        System.out.println("\nDigite o valor do saque: ");
                        saque = sc.nextDouble();
                        erro(saque, saldo);
                        saldo = saque(saque, saldo);
                    } catch (InputMismatchException e4) {
                        System.err.println("\nValor inválido!");
                    } catch (Exception e1) {
                        System.err.println(e1);
                    }
                break;
                case '2':
                    try {
                        System.out.println("\nDigite o valor do deposito: ");
                        deposita = sc.nextDouble();
                        erro(deposita, saldo);
                        saldo = deposita(deposita, saldo);
                    } catch (InputMismatchException e5) {
                        System.err.println("\nValor inválido!");
                    } catch (Exception e3) {
                        System.err.println(e3);
                    }
                break;
                case '3':
                    verifica(saldo);
                break;
            }
        } while (op != '4');
        sc.close();
    }
}