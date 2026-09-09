import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();

        if (idade >= 5 && idade <= 7){
            System.out.println("INFANTIL A");

        }else if (idade >= 8 && idade <= 10){
            System.out.println("INFANTIL B");

        }else if (idade >= 11 && idade <= 13){
            System.out.println("JUVENIL A");

        }else if (idade >= 14 && idade <= 17){
            System.out.println("JUVENIL B");

        }else if (idade >= 18){
            System.out.println("SÊNIOR");
        }else{
            System.out.println("Idade invalida");
        }
        entrada.close();
    }
}
/*
infantilA 5 - 7 anos
infantilB 8 - 10 anos
juvenilA 11-13 anos
juvenilB 14-17 anos
Sênior 18 anos ou mais*/
