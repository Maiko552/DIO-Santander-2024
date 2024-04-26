
import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        double saldo = 0;

        int opcao;
        do {
            String texto = new String(new char[40]).replace("/0", "--");
            System.out.println(texto);
            Thread.sleep(1500);
            System.out.println("Bem vindo ao Banco Virtual DIO!\n ");

            System.out.println("Você possui 4 opções: \n");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar saldo");
            System.out.println("0. Encerrar");


            System.out.print("\nEscolha: ");
            opcao = scan.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Depositar");
                    break;
                case 2:
                    System.out.println("Você escolheu Sacar");
                    break;
                case 3:
                    System.out.println("Você escolheu Consultar saldo");
                    break;
                case 0:
                    System.out.println("Encerrar...");
                    break;
                default:
                    System.out.println("Número Inválido");
                    System.out.println("Escolha novamente um número");
                    break;
            }


             if (opcao == 1) {
                 System.out.println("Digite o valor a ser depositado: ");
                 double valor = scan.nextDouble();
                 saldo += valor;
                 Thread.sleep(300);
                 System.out.printf("Agora você possui R$:%5.2f\n", saldo);
             }
             if (opcao == 2) {
                 System.out.println("Digite o valor a ser sacado: ");
                 double valor = scan.nextDouble();
                 if (saldo < valor) {
                     Thread.sleep(300);
                     System.out.println("\nSaldo insulficiente!\n");
                 } else {
                     saldo -= valor;
                     Thread.sleep(300);
                     System.out.printf("Agora você possui R$:%5.2f\n", saldo);
                 }

             }
             if (opcao == 3) {
                 System.out.println("Consulta de saldo bancario: ");
                 Thread.sleep(300);
                 System.out.printf("Você possui R$:%5.2f\n", saldo);
             }
        }while(opcao !=0);

    }

}
