public class FormatadorCep {
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("9003507");
        System.out.println("CEP: " + cepFormatado);
        } catch(CepInvalidoException e) {
        System.out.println("O cep informado é inválido!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "90.035-071";
    }
    
}