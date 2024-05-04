import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //atributos
    //chave unica e valor
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    //map para adicionar é put
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 131313);
        agendaContatos.adicionarContato("Camila", 12345);
        agendaContatos.adicionarContato("Maikon", 404040);
        agendaContatos.adicionarContato("Maikon silva", 212121);
        agendaContatos.adicionarContato("Jonathan", 55555);

        agendaContatos.exibirContatos();

        System.out.println("Contato removido");
        agendaContatos.removerContato("Jonathan");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Maikon"));
    }
}
