package exercicios.repeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int numero;
        int fatorial = 1;
        
        
        System.out.println("Digite um número para saber sua fatorial: ");
        numero = scan.nextInt();
        
        //int fatorial = numero;
        
        System.out.print(numero + "! = ");

        for(int i = numero ; i >= 1; i--){
            fatorial *= i;
        }
        System.out.print(fatorial);
    }
}
