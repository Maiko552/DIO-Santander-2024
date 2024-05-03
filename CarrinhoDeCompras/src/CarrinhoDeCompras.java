import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> item;

    public CarrinhoDeCompras(){
        this.item = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        item.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){

        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : item){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        item.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!item.isEmpty()) {
            for (Item item : item) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirItens() {
        if (!item.isEmpty()) {
            System.out.println(this.item);
        } else {
            System.out.println("A lista está vazia!");
        }
    }



    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 3d, 5);

        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }

}


