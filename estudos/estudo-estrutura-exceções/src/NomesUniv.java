import java.util.Scanner;

public class NomesUniv {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
		String[] nomes = new String[10];
		
		for(int i=0 ; i<5 ; i++){
			nomes[i] = sc.nextLine();
            
            if(i==0){
                continue;
            } else if(i==1){
                continue;
            }else
                System.out.println(nomes[i]);
            }
        
    }   
}
