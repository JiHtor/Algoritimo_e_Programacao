import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);

	String  operacao = "";
	
	System.out.print("Digite a operação desejada (+, -, *, /)");
	operacao = entrada.nextLine();
	
	System.out.println("Digite o primeiro numero");
	int num1 = entrada.nextInt();
	
	System.out.println("Digite o segundo numero");
	int num2 = entrada.nextInt();
	
	if(operacao.equals("+")) {
		System.out.println("O resultado da subtração é: " +(num1 + num2));			
	}else if(operacao.equals("-")) {
		System.out.println("O resultado da subtração é: " +(num1 - num2));		
	}else if(operacao.equals("*")) {
		System.out.println("O resultado da multiplicação é: " +(num1 * num2));		
	}else if(operacao.equals("/")) {
		System.out.println("O resultado da divisão é: " +(num1 / num2));			
	}else {
		System.out.println("Operação Invalida");
		}

	
	}
}