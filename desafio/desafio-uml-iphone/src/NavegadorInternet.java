public class NavegadorInternet {

    public void exibirPagina(String site) {
        verificarConexao();

        System.out.println("O site " + site + " está sendo exibido na tela!");

    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada ao navegador!");
    }

    public void atualizarPagina() {
        verificarConexao();
        System.out.println("A página foi atualizada! \n");
        
    }
    
    private void verificarConexao() {
        System.out.println("Verificando conexão com a Internet!");
    }
    
    
} 
