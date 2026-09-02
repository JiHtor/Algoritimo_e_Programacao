import java.util.Scanner;

public class Exercicio5 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota.");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite o valor da segunda nota.");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite o valor da segunda nota.");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3; 

        System.out.println("A media das notas é " + media);

        entrada.close();
    }
    
}
