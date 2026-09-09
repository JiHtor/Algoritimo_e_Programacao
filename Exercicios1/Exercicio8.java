/*
Faça um algoritmo para apresentar:
o cálculo da média das seguintes notas 8.0, 7.5, 4.5 e 9.
*/

//Feito por: Heitor Soares da Silva

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        double media = (8 + 7.5 + 4.5 + 9) / 4;

        System.out.println("A media das notas é " + media);

        entrada.close();
    }
}
