
    /*
    * Representada uma função que aceita um argumento do tikpo T e retorna um resultado
    * do tipo R.
    * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos;*/

    import java.util.Arrays;
    import java.util.List;
    import java.util.function.Function;
    import java.util.stream.Collectors;

    public class FunctionExample {
    public static void main(String[] args) {
        //Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar a Function com expressão lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os numeros no Stream e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        //Imprimir a lista de numeros dobrados
        numerosDobrados.forEach(System.out::println);
    }

}
