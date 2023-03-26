package aplicativos;
import javax.swing.table.AbstractTableModel;

public abstract class AplicacaoEscolhida {
    //ReprodutorMusical    
    public abstract void selecionarMusica();
    public abstract void tocar();
    public abstract void pausar();

    //AparelhoTelefonico
    public abstract void ligar(String telefone);
    public abstract void atender();
    public abstract void iniciarCorreioVoz();

    //NavegadorInternet
    public abstract void exibirPagina(String site);
    public abstract void adicionarNovaAba();
    public abstract void atualizarPagina();

}