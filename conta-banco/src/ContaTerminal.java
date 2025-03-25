import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Número da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agência: ");
        String agencia = scanner.next();

        System.out.println("Nome do Cliente: ");
        String nomecliente = scanner.next();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();
    }
}
