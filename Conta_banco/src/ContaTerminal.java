import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da sua Agencia: ");
        String Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da sua conta: ");
        int conta = scanner.nextInt();

        // Consume the newline character after the integer input
        scanner.nextLine();  // This will fix the problem

        System.out.println("Por favor, digite o seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        // Consume the newline character after the double input
        scanner.nextLine();  // This will fix the problem

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco. Sua Agência é " + Agencia +
                ", conta " + conta + ", e seu saldo " + saldo + " já está disponível para sacar!");

        // Close the scanner after usage
        scanner.close();
    }
}

