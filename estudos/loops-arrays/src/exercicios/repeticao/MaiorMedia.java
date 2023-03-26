package exercicios.repeticao;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;
        int media;

        int count = 0;

        do {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();

            soma = soma + numero;
            
            media = soma / 5;

            if (numero > maior){
                maior = numero;
            }

            count = count + 1;
        } while(count < 5);

        System.out.println("O maior número é o: " + maior);
        System.out.println("A média dos números é " + media);

    }
}