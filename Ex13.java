import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double resultado;

        System.out.println("Digite o primeiro numero");
        int num1 = entrada.nextInt();

        System.out.println("Digite o sinal da operação (+, -, *, /):");
        char operacao = entrada.next().charAt(0);

        System.out.println("Digite o segundo numero");
        int num2 = entrada.nextInt();

        if (operacao == '+') {
            resultado = num1 + num2;

        } else if (operacao == '-') {
            resultado = num1 - num2;

        } else if (operacao == '*') {
            resultado = num1 * num2;

        } else if (operacao == '/') {
            if (num2 > 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Impossível dividir!!");
            }
        } else {
            System.out.println("Sinal Inválido");


        entrada.close();
       }

    }

}