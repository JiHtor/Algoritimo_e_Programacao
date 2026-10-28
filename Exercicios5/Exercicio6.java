package Exercicios5;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int voto, cont, percent, votoCand1, votoCand2, votoCand3, votoCand4, votoNulo, votoBranco;
        cont = 0;
        votoCand1 = 0;
        votoCand2 = 0;
        votoCand3 = 0;
        votoCand4 = 0;
        votoNulo = 0;
        votoBranco = 0;

        for(cont = 1; cont <= 10; cont++){

            System.out.println("\nDigite seu voto: ");
            System.out.println("Candidato Numero - 1 ");
            System.out.println("Candidato Numero - 2 ");
            System.out.println("Candidato Numero - 3 ");
            System.out.println("Candidato Numero - 4 ");
            System.out.println("Voto Nulo - 5 ");
            System.out.println("Voto em Brando - 6 ");
            voto = entrada.nextInt();

            switch (voto) {
                case 1:
                votoCand1++;
                    break;
                case 2:
                votoCand2++;
                    break;
                case 3:
                votoCand3++;
                    break;
                case 4:
                votoCand4++;
                    break;
                case 5:
                votoNulo++;
                    break;
                case 6:
                votoBranco++;
                    break;
            default:
                System.out.println("Voto inválido");
                    break;
            }

        }
            System.out.println("O total de votos no Candidato 1 é "+ votoCand1);
            System.out.println("O total de votos no Candidato 2 é "+ votoCand2);
            System.out.println("O total de votos no Candidato 3 é "+ votoCand3);
            System.out.println("O total de votos no Candidato 4 é "+ votoCand4);
            System.out.println("O total de votos nulos é "+ votoNulo);
            System.out.println("O total de votos em branco é "+ votoBranco);
            percent = (votoNulo + votoBranco) * 100 / 10;
            System.out.println("O percentual dos votos brancos e nulos é "+ percent);

    }
}

