package Exercicios7;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o numero");
        int numero = entrada.nextInt();

        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
    public static int calcularFatorial(int numero){
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
            } 
        return resultado;         
    }     
}