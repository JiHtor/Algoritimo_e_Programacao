import java.util.Scanner;

public class Exercicio9{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        double lado = 350;

        double area = lado * lado;
        System.out.println("A area do quadrado é "+ area);
        entrada.close();
    }
}