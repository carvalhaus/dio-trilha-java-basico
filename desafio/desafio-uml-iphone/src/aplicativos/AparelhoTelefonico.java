package aplicativos;

public class AparelhoTelefonico extends AplicacaoEscolhida {

    public void ligar(String telefone){
        verificarCreditos();

        System.out.println("Você está ligando para o número: " + telefone);
    }

    public void atender() {
        System.out.println("Atenda a ligação!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("O número chamado encontra-se indisponível no momento.");
        System.out.println("Após o sinal deixe seu recado!");
    }

    private void verificarCreditos() {
        System.out.println("Verificando saldo para realização de ligações!");
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

}