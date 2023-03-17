package set;

import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {

        //Crie um conjunto contendo as cores do arco-íris e:
        String[] cores = {"Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"};
        Set<String> corArcoIris = new HashSet<>(Arrays.asList(cores));
                
        System.out.println("Exiba todas as cores uma abaixo da outra");
        for (String cor : corArcoIris) {
            System.out.println(cor);
        }

        System.out.println("\nExiba a quantidade de cores que o arco-íris tem");
        System.out.println(corArcoIris.size()); 

        System.out.println("\nExiba as cores em ordem alfabética");
        Set<String> corArcoIris1 = new TreeSet<>(corArcoIris);
        for (String cor : corArcoIris1){
            System.out.println(cor);
        }

        System.out.println("\nExiba as cores na ordem inversa da que foi informada");
        Set<String> corArcoIris2 = new LinkedHashSet<>(Arrays.asList(cores));
        List<String> corArcoIrisList = new ArrayList<>(corArcoIris2);
        Collections.reverse(corArcoIrisList);
        System.out.println(corArcoIrisList);


        System.out.println("\nExiba todas as cores que começam com a letra 'v'");
        Iterator<String> iterator = corArcoIris.iterator();
        while(iterator.hasNext()) {
            String letraV = iterator.next();
            if(letraV.contains("V"))
                System.out.println(letraV);
        }


        System.out.println("\nRemova todas as cores que não começam com a letra 'v'");
        Iterator<String> iterator1 = corArcoIris.iterator();
        while(iterator1.hasNext()) {
            String letraV = iterator1.next();
            if(letraV.contains("V"))
                iterator1.remove();
        }
        System.out.println(corArcoIris);

        System.out.println("\nLimpe o conjunto");
        corArcoIris.clear();

        System.out.println("\nConfira se o conjunto está vazio: \n" + corArcoIris.isEmpty());
}
}