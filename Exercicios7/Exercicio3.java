package Exercicios7;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primero numero");
        int n1 = entrada.nextInt();
        System.out.println("Digite o primero numero");
        int n2 = entrada.nextInt();

        int resultado;
        resultado = resul(n1, n2);

        System.out.println("E o numero maior é "+ resultado);
    }
    public static int resul(int n1, int n2){
        if (n1 > n2){
            System.out.println("O numero 1 é maior que o numero 2");
            return n1;
        }else{
            System.out.println("O numero 2 é maior que o numero 1");
            return n2;
        }  
    } 
}