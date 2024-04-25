import java.util.Locale;
import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scan.nextInt();


        int i;
        for (i = num1; i <= num2; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
        parametrosInvalidosException(num1, num2);

        scan.close();


    }
     static void parametrosInvalidosException(int num1, int num2) {
        if (num1 > num2){
            System.out.println("Não é possível continuar. O número dois precisa ser maior que o um!!");
        }
    }
}
