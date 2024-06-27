import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      
        System.out.println("Por favor, digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();
        
        
        System.out.println("Por favor, digite o saldo:");
        double Saldo = scanner.nextDouble();


        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, " + nome +  " obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta " + conta+ " e seu saldo " +Saldo+ " já está disponível para saque." );
        
    }
}