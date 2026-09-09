import java.util.Scanner;

public class ExemploIF {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do jogador");
        String nome = entrada.nextLine();

        System.out.println("Digite o numero de pontos do jogador");
        Double pontos = entrada.nextDouble();

        if (pontos >= 1000){
            System.out.println("Parabens voce passou para a fase 2");
        }
        System.out.println("Siga para a proxima entrada");
        entrada.close();
        
        System.out.println("Seu nome = " + nome);
        System.out.println("Seus pontos = "+ pontos);

    }
}
