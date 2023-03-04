public class AparelhoTelefonico{

    public void ligar(int telefone) {
        verificarCreditos();

        System.out.println("Você está ligando para o número: " +telefone);
    }

    private void verificarCreditos() {
        System.out.println("Verificando saldo para realização de ligações!");
    }

}