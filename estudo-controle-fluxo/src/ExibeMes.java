public class ExibeMes {
    public static void main(String[] args) throws Exception {
        ifMes();
    }
        private static void ifMes() {
        
        int mes = 66;
        if(mes == 1){
            System.out.println("O mês é janeiro!");
        } else if (mes == 2){
            System.out.println("O mês é fevereiro!");
        } else if (mes == 3){
            System.out.println("O mês é março!");
        } else if (mes == 4){
            System.out.println("O mês é abril!");
        } else if (mes == 5){
            System.out.println("O mês é maio!");
        } else if (mes == 6){
            System.out.println("O mês é junho!");
        } else if (mes == 7){
            System.out.println("O mês é julho!");
        } else if (mes == 8){
            System.out.println("O mês é agosto!");
        } else if (mes == 9){
            System.out.println("O mês é setembro!");
        } else if (mes == 10){
            System.out.println("O mês é outubro!");
        } else if (mes == 11){
            System.out.println("O mês 11 é o mês de novembro!");
        } else if (mes == 12){
            System.out.println("O mês 12 é o mês de dezembro!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
}
