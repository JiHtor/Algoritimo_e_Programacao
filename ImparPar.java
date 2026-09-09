import java.util.Scanner;

public class ImparPar {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar");
        }
        entrada.close();
    }
}
