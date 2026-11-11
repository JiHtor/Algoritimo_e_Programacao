package Exercicios7;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7:");
        int numero = entrada.nextInt();

        String resultado = exibirDiaSemana(numero);

        System.out.println(resultado);
        
        entrada.close();
    }

    public static String exibirDiaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda";
            case 3:
                return "Terça";
            case 4:
                return "Quarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            case 7:
                return "Sábado";
            default:
                return "Dia da semana inválido";
        }
    }
}