import java.util.Random;
public class NumeroAle{
    public static void main (String [] args){

    Random random = new Random();

    int sorteado = 10 + random.nextInt(90 + 1);

    System.out.println("O numero sorteado é "+ sorteado);
    while (true) { 
        if(sorteado == 24){
        System.out.println("Voce é gay");
            }
        }
    }
}