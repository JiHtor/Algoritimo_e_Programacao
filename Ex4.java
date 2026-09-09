import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int num1 = entrada.nextInt();
        System.out.println("Digite o primeiro numero");
        int num2 = entrada.nextInt();

        if(num1 < num2){
            System.out.println("O "+ num1 + " é menor que o "+ num2);
        }else if(num1 > num2){
             System.out.println("O "+ num2 + " é menor que o "+ num1);
        }
        entrada.close();
    }
}
