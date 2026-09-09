import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a Senha");
        String senha = entrada.nextLine();

        if(senha.equals("R10p5")){
            System.out.println("Acesso Concedido");
        }else {
            System.out.println("Acesso Negado");
        }
        entrada.close();
    }
}
/*Faça um algoritmo que verifique a validade de uma senha 	fornecida pelo usuário.
sabendo que a senha é R10p5:
¨ imprimir mensagem de “acesso concedido” ou “acesso negado”.
Para comparar duas Strings utilizar o método equals();
ele retorna um valor booleano!
Exemplo:
¨ if(senha.equals("R10p5"))*/
