public class Iphone {
    public static void main(String[] args) throws Exception {
        NavegadorInternet navegador = new NavegadorInternet(); 

        navegador.exibirPagina("Google");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        
    }
}
