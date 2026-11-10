package Aulas;
import java.util.Random;

public class exaleatorio {
    public static void main (String [] args){

        Random sorteio = new Random();

        int numero = 1 + sorteio.nextInt(100);

        System.out.println("O numero sorteado é "+ numero);
        if(numero % 2 == 0){
            System.out.println("E ele é par");
        }else{
            System.out.println("E ele é impar");
        }
    }
}
