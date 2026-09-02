import java.util.Scanner;

public class Exercicio11 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento");
        double nascimento = entrada.nextDouble();

        System.out.println("Digite o ano atual");
        double ano = entrada.nextDouble();

        double idade = ano - nascimento;
        double frente = (2030 - nascimento);
        System.out.println("Sua idade é "+ idade);
        System.out.println("Voce terá "+ frente);

        entrada.close();


    }
   
}
