import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    //atributos
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();

    }

    public void addProduct(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(quantidade, nome,  preco));
    }

    public void showProduct(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculateTotalValue(){
        //retorna o valor total
        double value = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                 value += p.getQuantidade() * p.getValor();

            }
        }
        return value;
    }

    public Produto mostExpensiveProduct(){
        Produto expensiveProduct = null;
        double mostPrice = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()) {
                if (p.getValor() > mostPrice){
                    expensiveProduct = p;
                }
            }

        }
        return expensiveProduct;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();


        estoque.addProduct(1L, "Produto A ", 5, 50.0) ;
        estoque.addProduct(2L, "Produto B ", 3, 3.50) ;
        estoque.addProduct(3L, "Produto C ", 7, 1.20) ;
        estoque.addProduct(4L, "Produto D ", 5, 10.40) ;

        estoque.showProduct();
        System.out.println("Valor total do estoque: R$" + estoque.calculateTotalValue());
        System.out.println("Produto mais caro: " + estoque.mostExpensiveProduct());
    }
}
