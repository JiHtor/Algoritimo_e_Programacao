import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int diferenca;

        System.out.println("Digite o primeiro numero");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = entrada.nextInt();

        if(num1 == num2){
            System.out.println("Os numeros são iguais");
        }else if (num1 > num2) {
            diferenca = num1 - num2;
             System.out.println("O Numero 1 > 2, e a subtração deles é "+ diferenca);         
        }else if(num1 < num2 ){
            diferenca = num2 - num1;
            System.out.println("O Numero 1 < 2, e a subtração deles é "+ diferenca);         
        }
        entrada.close();



    }
    
}
