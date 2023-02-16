package candidatura;

import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Processo Seletivo!");
    
        System.out.println("Digite o salário pretendido: ");
        analisarProposta(scan.nextDouble());
    
    }

    static void analisarProposta(double salarioPretendido){
        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO;");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
