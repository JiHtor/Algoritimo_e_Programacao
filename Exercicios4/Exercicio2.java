package Exercicios4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int contador = 0;
        int par = 0;
        int impar = 0;


        while(contador < 10){
            contador++;
        System.out.println("Digite o numero "+ contador);
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
}
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
    }
}