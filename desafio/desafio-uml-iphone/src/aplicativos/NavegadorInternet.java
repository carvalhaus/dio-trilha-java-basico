package aplicativos;

public class NavegadorInternet extends AplicacaoEscolhida{

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

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tocar'");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atender'");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioVoz'");
    }

    @Override
    public void ligar(String telefone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }
    
    
} 
