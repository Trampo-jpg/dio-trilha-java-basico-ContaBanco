import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
     String nomeCliente = "";
     int numero = 0;
     String agencia = "";
     double saldo = 0;

     Scanner scanner = new Scanner(System.in);


     System.out.println("Nome Cliente:");
     nomeCliente = scanner.nextLine();

     System.out.println("Agência:");
     agencia = scanner.nextLine();

     
     System.out.println("Numero:");
     numero = scanner.nextInt();


     System.out.println("Saldo:");
     saldo = scanner.nextDouble();



     System.out.println(" Olá " + nomeCliente + " Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " Conta " + numero + " e seu saldo " + saldo + " já está disponível para saque. "
     );
    }



}
