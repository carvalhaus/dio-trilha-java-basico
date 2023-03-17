package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> listaTemperaturas = new ArrayList<Double>();

        double soma = 0d;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite a temperatura do mês: ");
            Double temp = scan.nextDouble();
            listaTemperaturas.add(temp);
            soma += temp;
        }

        double media = soma / listaTemperaturas.size();

        for (Double temp : listaTemperaturas) {
            if(temp > media) {
                int index = listaTemperaturas.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " ºC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " ºC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " ºC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ "  ºC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " ºC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " ºC");
                        break;
                    default:
                        break;
                }
            }
        }

    }
}