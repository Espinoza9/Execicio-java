package exercicio3;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita informações ao usuário
        System.out.println("Programa: Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Programa: Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer após a leitura do número da conta

        System.out.println("Programa: Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Programa: Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Fecha o scanner
        scanner.close();

        // Exibe as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
