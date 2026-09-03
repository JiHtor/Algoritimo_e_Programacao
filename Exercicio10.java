/*
Construir um algoritmo para imprimir:
o cálculo da área de um círculo com raio de 5 cm. (π = 3.14159)
área do círculo = π ˆ r2
*/

//Feito por: Heitor Soares da Silva

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        double raio = 5;

        double area = Math.PI * (raio * raio);
        System.out.println("A area do circulo é "+ area);
        entrada.close();
    }
    
}
