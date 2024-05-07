public class Produto {

    //atributos
    private String nome;
    private int quantidade;
    private double valor;

    public Produto(int quantidade, String nome, double valor) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}
