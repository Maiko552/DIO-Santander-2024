import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

    /*
    Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
    É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream
    sem modificar, ou retornar valor.
    * */

public class ConsumerExample {
    public static void main(String[] args) {
        //criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //usar o Consumer com expressão lambda para imprimir números pares
        //PRIMEIRO:  dos jeitos de fazer
        System.out.println("PRIMEIRO MODO DE FAZER LAMBDA:");
        Consumer<Integer> imprimirNumerosPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        //Usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumerosPar);

        //SEGUNDO
        System.out.println("SEGUNDO MODO DE FAZER LAMBDA:");
        Consumer<Integer> imprimirPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };
        numeros.stream().forEach(n -> {
            if (n % 2 == 0){
                System.out.println(n);
            }
        } );
    }
}
