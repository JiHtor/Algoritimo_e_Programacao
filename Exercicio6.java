import java.util.Scanner;

public class Exercicio6 {
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        double p1 = (20 - 15) / 2;
        double p2 = Math.pow(2, (5/20) + 30) / Math.pow (15, 2);
        double p3 = 35 / (6 + 2);
        double p4 = 23 % 4;

        System.out.println("O resultado da operação é " + p1);
        System.out.println("O resultado da operação é " + p2);
        System.out.println("O resultado da operação é " + p3);
        System.out.println("O resultado da operação é " + p4);

        entrada.close();

    }
}
