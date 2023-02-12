import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Para acessar o seu saldo precisaremos que você nos informe seus dados!");

        System.out.println("Por favor, digite o número de sua conta: ");
        conta = scan.nextInt();

        System.out.println("Agora, digite o número de sua agência: ");
        agencia = scan.next();

        System.out.println("Digite o seu nome completo: ");
        nomeCliente = scan.next();

        System.out.println("Digite seu saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}