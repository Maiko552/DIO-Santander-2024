
    /*
    * Representa uma funçao que aceita um argumento do tipo T e retorna o valor boolean.
    * É comumente usada para filtrar os elementos do Stream com base em alguma condiçao*/

    import java.util.Arrays;
    import java.util.List;
    import java.util.function.Predicate;

    public class PredicateExample {
    public static void main(String[] args) {
        //Criar uma lista de palavras
        List<String> nomes = Arrays.asList("Maikon", "Jonathan", "Meire", "Almerinda", "João"   );

        //criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracter = nomeVerificacao -> nomeVerificacao.length() > 5;

        //Usar o Stream para filtrar as palavras com mais de 5 caractes e, em seguida,
        //Imprimier cada palavra que passou no filtro
        nomes.stream()
                .filter(maisDeCincoCaracter)
                .forEach(System.out::println);

    }
}

