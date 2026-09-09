import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero");
        int num2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero");
        int num3 = entrada.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("O primeiro numero é maior que os outros");
        } else if(num2 > num1 && num2 > num3){
            System.out.println("O segundo numero é maior que os outros");
        } else{
            System.out.println("O terceiro numero é maior que os outros");
        }
        entrada.close();            
    }
}
