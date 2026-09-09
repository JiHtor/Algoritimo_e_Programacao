import java.util.Scanner;

public class ExemAdivinhar {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        
        int num = 15;
        System.out.println("Digite o numero para adivinhar");
        int adivinhar = entrada.nextInt();
        
        if(adivinhar == num){
            System.out.println("Parabens voce acertou o numero");
        }else if (adivinhar < 15) {
            System.out.println("É um numero maior");            
        }else if (adivinhar > 15){
            System.out.println("É um numero menor");
        }
                
    }
    
}
