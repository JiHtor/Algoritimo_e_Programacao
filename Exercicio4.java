/*
Faça um algoritmo que leia quatro números inteiros.
calcule e mostre a soma desses números.
*/

//Feito por: Heitor Soares da Silva

import java.util.Scanner;

public class Exercicio4 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o primeiro numero");
        int numero2 = entrada.nextInt();

        System.out.println("Digite o primeiro numero");
        int numero3 = entrada.nextInt();

        System.out.println("Digite o primeiro numero");
        int numero4 = entrada.nextInt();

        int soma = numero1 + numero2 + numero3 + numero4;

        System.out.println("A soma dos numero é "+ soma);
        entrada.close();
    }
    
}
