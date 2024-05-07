
    /*
    * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
    * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
    * */

    import java.util.Arrays;
    import java.util.List;
    import java.util.function.BinaryOperator;

    public class BinaryOperatorExample {
    public static void main(String[] args) {

        //Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar o BinaryOperator com expressao lambda para somar dois numeros inteiros
        //Somar os numeros
        BinaryOperator<Integer> somar = Integer::sum;


        //Usar o BinaryOperator para somar todos os numeros no Stream
        int resultado = numeros.stream()
                //Variavel de referencia/temporaria
                .reduce(0, Integer::sum);

        //Imprimir o resultado da soma
        System.out.println("A soma dos números é:" + resultado);
    }
}
