import java.util.Scanner;
public class exec04_contas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n1, n2;
    int op;
    System.out.println("Digite o primeiro numero = ");
    n1 = sc.nextDouble();
    System.out.println("Digite o segundo numero = ");
    n2 = sc.nextDouble();
    System.out.println("Escolha uma das opções abaixo. \n1 = A média entre os dois números.\n2 = A diferença do maior pelo menor.\n3 = O produto entre os dois números.");
    op = sc.nextInt();
    switch (op) {
      case 1:
          System.out.println("A media e = " + (n2 + n1) / 2);
          break;
      case 2:
          if (n1 > n2) {
              System.out.println("A diferença e de = " + (n1 - n2));
          } else {
              System.out.println("A diferença e de = " + (n2 - n1));
          }
          break; 
      case 3:
          System.out.println("O produto entre os dois numero e de = " + (n1 * n2));
          break;
        default:
          System.out.println("ERRO 404");
            break;
    }
    sc.close();
  }  
}