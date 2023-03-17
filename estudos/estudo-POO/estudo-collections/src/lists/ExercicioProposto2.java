package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List <String> investigacaoCrime = new ArrayList<String>();
        
        System.out.println("Você está participando de uma investigação criminal e deverá responder uma série de perguntas. Você deve responder apenas 'Sim' ou 'Não'." + "\n=========================================================================================================================================");
        
        System.out.println("1. Telefonou para a vítima?");
        investigacaoCrime.add(scan.next());
        
        System.out.println("2. Esteve no local do crime?");
        investigacaoCrime.add(scan.next());

        System.out.println("3. Mora perto da vítima?");
        investigacaoCrime.add(scan.next());

        System.out.println("4. Devia para a vítima?");
        investigacaoCrime.add(scan.next());
        
        System.out.println("5. Já trabalhou com a vítima?");
        investigacaoCrime.add(scan.next());

        System.out.println(investigacaoCrime);
        
        int count = 0;
        
        Iterator<String> contador = investigacaoCrime.iterator();
        while(contador.hasNext()) {
            String resp = contador.next();
            if(resp.contains("S"))
                count++;
            
        }

        switch (count) {
            case 2:
                System.out.println("Suspeita!");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice!");
                break;
            case 5:
                System.out.println("Assassina!");
                break;
            default:
                System.out.println("Inocente!");
                break;
        }
    }
}    



