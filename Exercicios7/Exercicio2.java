package Exercicios7;

public class Exercicio2 {
    public static void main(String[] args) {

        System.out.println("Começo");
        imprimeNovaMensagem("Primeira");
        imprimeNovaMensagem("Segunda");
        imprimeNovaMensagem("Terceira");
        System.out.println("Fim");
        }

    public static void imprimeNovaMensagem(String mensagem) {
        System.out.println("Meu primeiro programa com funcoes e parametro: " + mensagem);
    }
}