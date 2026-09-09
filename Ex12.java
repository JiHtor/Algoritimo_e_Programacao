import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double imposto;
        System.out.println("Digite seu salario");
        Double salario = entrada.nextDouble();

        if(salario <= 600){
            System.out.println("Isento de imposto");

        }else if(salario > 600 && salario <= 1200){
            imposto = salario * 0.2;
            System.out.println("O desconto foi de "+ imposto);

        }else if(salario > 1200 && salario <= 2000){
            imposto = salario * 0.25;
            System.out.println("O desconto foi de "+ imposto);

        }else if(salario >= 2000){
            imposto = salario * 0.3;
            System.out.println("O desconto foi de "+ imposto);
        }
        entrada.close();
    }
}