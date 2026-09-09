import java.util.Scanner;

public class Ex6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Double peso;
        System.out.println("Digite seu sexo.");
        String sexo = entrada.nextLine();

        System.out.println("Digite sua altura.");
        Double altura = entrada.nextDouble();

        if(sexo.equalsIgnoreCase("Masculino")) {
            peso = (72.7 * altura) - 58;   
            System.out.println("Seu peso ideal é "+ peso);
        }else if (sexo.equalsIgnoreCase("Feminino")){
            peso = (62.1 * altura) - 44.7; 
            System.out.println("Seu peso ideal é "+ peso);
        }else {
            System.out.println("Sexo não identificado.");
        }
        entrada.close();
    }
}

