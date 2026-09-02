import java.util.Scanner;

public class Exercicio12 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero");
        double num = entrada.nextDouble();

        double quad = num * num;
        double cubo = num * num * num;
        double quadrada= Math.sqrt(num);
        double potencia = Math.pow(num, 10);
        System.out.println("O numero ao quadrado é "+ quad);
        System.out.println("O numero ao cubo é "+ cubo);
        System.out.println("A raiz quadra do numero é "+ quadrada);
        System.out.println("O numero elevado a potencia 10 é "+ potencia);
        entrada.close();

    }
    
}
