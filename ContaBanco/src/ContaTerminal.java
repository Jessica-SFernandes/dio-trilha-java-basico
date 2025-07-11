import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        String saldoFormatado = String.format("R$ %.2f", saldo);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso Banco, " + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque.");
        
        scanner.close();
    }
}