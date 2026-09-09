import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero");
        int num = entrada.nextInt();

        if(num >= 50 && num <= 100){
        System.out.println("Pertence ao intervalo");
        }else{
             System.out.println("Não pertence ao intervalo");
        }
    }
}
