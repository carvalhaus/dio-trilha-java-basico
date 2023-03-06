package aplicativos;

public class ReprodutorMusical extends AplicacaoEscolhida {
    public void selecionarMusica() {
        carregarListaMusicas();
        System.out.println("Selecione a música ou playlist que deseja ouvir.");   
    }

    public void tocar() {
        System.out.println("Reproduzindo música selecionada.");
    }

    public void pausar() {
        System.out.println("A reprodução foi pausada!");
    }

    private void carregarListaMusicas() {
        System.out.println("Carregando lista de músicas. Aguarde um momento!");
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
    public void exibirPagina(String site) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }

    @Override
    public void ligar(String telefone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }
}
