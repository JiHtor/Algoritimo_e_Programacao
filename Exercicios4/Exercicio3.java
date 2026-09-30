package Exercicios4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int termo = 1;
        
        System.out.print("Sequência: ");
        while (termo <= numero) {
            System.out.print(termo + " ");
            termo = termo * 2;
        }
        System.out.println("\nAlgoritmo encerrado.");
        entrada.close();
    }
}
