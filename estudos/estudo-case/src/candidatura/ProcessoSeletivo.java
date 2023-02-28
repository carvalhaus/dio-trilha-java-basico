package candidatura;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
            
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!");

        } while(continuarTentando && tentativasRealizadas <3);

        if(atendeu)
            System.out.println("Conseguimos contato com: " + candidato + " após " + tentativasRealizadas + " tentativa(s).");
        else
            System.out.println("Não conseguimos contato com " + candidato);
    }

    //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}


    static void imprimirSelecionados() {
        
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        
        for(int indice = 0; indice < candidatos.length ; indice++) {
            System.out.println("O candidato de nº " + indice + " é " + candidatos[indice]);
        }

    }

    static void selecaoCandidatos() {
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    
    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
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


