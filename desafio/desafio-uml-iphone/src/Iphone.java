import java.util.Scanner;

import aplicativos.AparelhoTelefonico;
import aplicativos.AplicacaoEscolhida;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o aplicativo: ");
        AplicacaoEscolhida app = null;

        String appEscolhido = scan.next();

        switch (appEscolhido) {
            case "musica":{
                app = new ReprodutorMusical();
                app.selecionarMusica();
                app.tocar();
                app.pausar();
                break;
            }
            case "chamada":{
                app = new AparelhoTelefonico();

                System.out.println("Digite o número que deseja realizar a ligação: ");
                String telefone = scan.next();

                app.ligar(telefone);
                app.atender();
                app.iniciarCorreioVoz();
                break;
            }
            case "internet":{
                app = new NavegadorInternet();

                System.out.println("Digite o site que deseja acessar: ");
                String site = scan.next();

                app.exibirPagina(site);
                app.adicionarNovaAba();
                app.atualizarPagina();
                break;
            }
            default:
            System.out.println("Aplicativo indisponível.");
            break;
        }
               
    }
}
