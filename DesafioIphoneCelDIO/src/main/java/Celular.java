public class Celular  {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("Aplicativo de música");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("------------------------------");
        System.out.println("Aparelho Telêfonico");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("------------------------------");
        System.out.println("Internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();



    }
}
