import java.util.Scanner;

public class Exercicio6 {
    public static void main (String [] args){

        Scanner entrada = new Scanner (System.in);

        int numero = 1;
        while(numero <= 10){
        System.out.println("Digite a nota");
        int nota = entrada.nextInt();
        numero++;
        }
    }
}
