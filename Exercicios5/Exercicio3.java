package Exercicios5;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int termo;

        System.out.println("Digite o numero: ");
        int numero = entrada.nextInt();
        
        for(termo = 1; termo <= numero;termo++){
            System.out.print(termo + " ");
        }
        System.out.println("\nAlgoritmo encerrado.");
        entrada.close();
    }
}
