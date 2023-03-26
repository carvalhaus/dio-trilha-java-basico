package heranca;
public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario funcionario = new Funcionario();

        //Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast
        //Vendedor vendedor = (Vendedor) new Funcionario();
    }
}
