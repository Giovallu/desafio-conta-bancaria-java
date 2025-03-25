import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Agência: ");
        String agencia = scanner.nextLine(); ;

        System.out.print("Nome do Cliente: ");
        String nomecliente = scanner.nextLine();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomecliente + ", obrigado(a) por criar uma conta em nosso banco, sua agência é '" + agencia + "', conta '" + numero + "' e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
