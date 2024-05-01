import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        String agencia;
        int numero;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a agência:  ");
        agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da conta:  ");
        numero = scanner.nextInt();

        System.out.println("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo +" já esta disponível para saque.");

    }
}
