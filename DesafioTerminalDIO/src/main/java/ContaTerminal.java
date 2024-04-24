import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.println("Conta Bancária");

        System.out.println("Entre com o número da conta:");
        int numConta = scan.nextInt();

        System.out.println("Entre com a agência:");
        String agencia = scan.next();

        System.out.println("Entre com o nome do senhor (a):");
        String nome = scan.next();

        System.out.println("Entre com o saldo inicial:");
        double saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f%n já está disponível para o saque", nome, agencia, numConta, saldo);
        scan.close();
    }

}
