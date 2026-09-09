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

