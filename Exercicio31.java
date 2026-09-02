import java.util.Scanner;

public class Exercicio31 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double numero1 = entrada.nextDouble();

        System.out.println("Diite o segundo numero");
        double numero2 = entrada.nextDouble();

        double produto = numero1 * numero2;

        System.out.println("O produto dos numeros é "+ produto);
        entrada.close();
    

    }    
}
