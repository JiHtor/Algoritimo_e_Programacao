import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double soma;
        Double bonus;

        System.out.println("Digite seu sálario");
        Double salario = entrada.nextDouble();

        System.out.println("Digite o tempo de empresa");
        int tempo = entrada.nextInt();
        
        if(tempo >= 5){
            bonus = (salario * 0.2);
            soma = salario + bonus;
            System.out.println("Seu bônus é de "+ bonus);
            System.out.println("Seu salario com o bônus é "+ soma);
        }else {
            bonus = (salario * 0.1) ;
            soma = salario + bonus;
            System.out.println("Seu bônus é de "+ bonus);
            System.out.println("Seu salario com o bônus é "+ soma);
        }
        entrada.close();
        
        
    }
}
/*A empresa XSoftware concedeu um bônus de 20% do valor do salário a 	
todos os funcionários com tempos de trabalho na empresa igual ou 	
superior a cinco anos e de 10% aos demais funcionários.
Faça um algoritmo que leia o salário e a quantidade de anos de cada 	
funcionário, calcule e imprima o valor do bônus.*/

