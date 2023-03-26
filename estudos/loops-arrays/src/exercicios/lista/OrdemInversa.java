package exercicios.lista;

public class OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {5, 6, 8, 110, 56, 99};

        int count = 0;

        System.out.print("Vetor: ");
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor ordem inversa: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
