package Exercicios5;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont, idade, quantiAcima, percent, pesoAbaixo, quantiMedia;
        double altura, peso, media, calc;
        cont = 0;
        quantiAcima = 0;
        media = 0;
        pesoAbaixo = 0;
        quantiMedia = 0;

        for(cont = 1; cont <= 10; cont++){

        System.out.println("Digite sua idade");
        idade = entrada.nextInt();

        System.out.println("Digite sua altura (Com ,) ");
        altura = entrada.nextDouble();

        System.out.println("Digite seu peso (Com ,)");
        peso = entrada.nextDouble();

        if(idade > 50){
            quantiAcima++;
        }
        if(idade >= 10 && idade <= 20){
            media = media + altura;
            quantiMedia++;
        }
        if(peso < 40){
            pesoAbaixo++;
        }
        }
        System.out.println("A quantidade de pessoas maiores de 50 anos é "+quantiAcima);
        calc = media / quantiMedia;
        System.out.println("A média das alturas das pessoas entre 10 e 20 anos é " + calc);
        percent = pesoAbaixo * 100 / 10;
        System.out.println("A porcentagem de pessoas com peso inferior a 40 kg é " + percent + "%");
    }
}
