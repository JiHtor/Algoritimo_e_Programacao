/*
Construir um algoritmo que leia:
o ano de nascimento de uma pessoa e o ano atual.
Calcule e mostre:
a idade dessa pessoa;
quantos anos essa pessoa terá em 2030.
*/

//Feito por: Heitor Soares da Silva

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento");
        double nascimento = entrada.nextDouble();

        System.out.println("Digite o ano atual");
        double ano = entrada.nextDouble();

        double idade = ano - nascimento;
        double frente = (2030 - nascimento);
        System.out.println("Sua idade é "+ idade);
        System.out.println("Voce terá "+ frente+ "em 2030");

        entrada.close();


    }
   
}
