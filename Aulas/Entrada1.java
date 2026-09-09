package Aulas;
import java.util.Scanner;

public class Entrada1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota.");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite o valor da segunda nota.");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2; 

        System.out.println("A media das notas é " + media);

        scanner.close();
    }
    
}
