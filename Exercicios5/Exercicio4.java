package Exercicios5;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int idade, cont, quantidade = 0;
        double altura, soma = 0, media;

        for(cont = 1; cont <= 10; cont++){
        System.out.println("Digite sua idade");
        idade = entrada.nextInt();

        System.out.println("Digite sua altura (Com , )");
        altura = entrada.nextDouble();

        if(idade > 50) {
        soma = soma + altura;
        quantidade++;
        }}
        if(quantidade > 0) {
            media = soma / quantidade;
            System.out.println("A média das alturas das pessoas com mais de 50 anos é: " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos");
        }
        System.out.println("\nAlgoritmo encerrado.");
        entrada.close();
    }
}

