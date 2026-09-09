import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu sálario bruto");
        Double salario = entrada.nextDouble();
        System.out.println("Digite a prestação");
        Double presta = entrada.nextDouble();

        if (presta >= (salario * 0.3)) {
            System.out.println("Empréstimo não pode ser concedido!");          
        }else if (presta <= (salario * 0.3)) {
            System.out.println("Empréstimo pode ser concedido!"); 
        }
        entrada.close();
    }
}