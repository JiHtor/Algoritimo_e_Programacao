package Exercicios2;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Trouxe documento com foto? (S/N)");
        String documento = entrada.next();
//vota apartir de 16
        System.out.println("Trouxe titulo de eleitor? (S/N)");
        String titulo = entrada.next();
        if(documento.equals("S") && titulo.equals("S") && idade >= 16 && idade < 18) {
            System.out.println("Você pode votar, mas não é obrigatório.");
        } else if (documento.equals("S") && titulo.equals("S") && idade >= 18) {
            System.out.println("Você já pode votar.");
        } else if (documento.equals("S") && titulo.equals("S") && idade < 16) {
            System.out.println("Você não pode votar, pois é menor de idade.");
        } else if (documento.equals("N") || titulo.equals("N")) {
            System.out.println("Você não pode votar, pois não possui documento ou título de eleitor.");
        }
//voto apartir de 18
        else if(documento.equals("S") && titulo.equals("S") && idade >= 18) {
            System.out.println("Você já pode votar.");
        } else if (documento.equals("S") && titulo.equals("S") && idade < 18) {
            System.out.println("Você não pode votar, pois é menor de idade.");
        } else if (documento.equals("N") || titulo.equals("N")) {
            System.out.println("Você não pode votar, pois não possui documento ou título de eleitor.");
        } else {
            System.out.println("Informações inválidas.");
        }
        entrada.close();
    }
}