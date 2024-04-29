public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Internet {


    @Override
    public void tocar() {
        System.out.println("Tocar música.");

    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar outra música.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligar para alguém.");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página na web.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar a página.");
    }
}
