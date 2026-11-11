package Exercicios7;

import java.util.Scanner;

public class Exercicio4 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int repetir;

        for(repetir = 1; repetir <= 5; repetir++){
        System.out.println("Digite o numero");
        int numero = entrada.nextInt();

        boolean resultado = isPar(numero);

        if (resultado){
            System.out.println("É par");
        }else{
        System.out.println("É impar");
            }
        }
    }
    public static boolean isPar(int numero){
        if (numero % 2 ==0){
            return true;         
        }else{
            return false;
        }
    }   
}