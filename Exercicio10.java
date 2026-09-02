import java.util.Scanner;

public class Exercicio10 {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        double raio = 5;

        double area = Math.PI * (raio * raio);
        System.out.println("A area do circulo é "+ area);
        entrada.close();
    }
    
}
