import java.util.Scanner;

public class Ex1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        int calculo;
        System.out.println("Digite o numero inteiro");
        int numero = entrada.nextInt();

        if (numero > 20){
            calculo = numero / 2;
        System.out.println("O numero dividido por 2 é "+ calculo);
        }
        System.out.println("Seu numero é "+ numero);
        entrada.close();


    }
    
}