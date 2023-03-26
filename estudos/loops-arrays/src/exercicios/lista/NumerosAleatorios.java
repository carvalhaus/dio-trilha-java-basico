package exercicios.lista;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        
        Scanner scan = new Scanner(System.in);

        int[] numerosAleatorios = new int[20];
        int count = 0;

        do{
            int numero = random.nextInt(0, 100);
            numerosAleatorios[count] = numero;

            count++;

        } while (count < numerosAleatorios.length);

        System.out.println("Números aleatórios e seus sucessores:");

        for (int i : numerosAleatorios) {
            System.out.println(i + " e " + (i+1));
        }
    }
}
