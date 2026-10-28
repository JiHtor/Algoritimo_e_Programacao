package Exercicios5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, mediaAluno, mediaSala, somaMedia, contExa, contRepr, cont, contAprov;
        cont = 0;
        contAprov = 0;
        contExa = 0;
        contRepr = 0;
        somaMedia = 0;

        for(cont = 1; cont <= 6; cont++){
            System.out.println("Digite a primeira nota");
            nota1 = entrada.nextInt();

            System.out.println("Digite a segunda nota");
            nota2 = entrada.nextInt();

            mediaAluno = (nota1 + nota2) / 2.0;
            System.out.println("A média do aluno é \n"+ mediaAluno);

            somaMedia = somaMedia + mediaAluno;

            if(mediaAluno <= 3){
                System.out.println("Estado: REPROVADO\n");
                contRepr++;
            }else if(mediaAluno > 3 && mediaAluno < 7){
                System.out.println("Estado: EXAME\n");
                contExa++;
            }else if(mediaAluno >= 7){
                System.out.println("Estado: APROVADO\n");
                contAprov++;
            }

        }   mediaSala = somaMedia / 6.0;
            System.out.println("O total de Reprovados é "+ contRepr);
            System.out.println("O total de Exame é "+ contExa);
            System.out.println("O total de Aprovados é "+ contAprov);
            System.out.println("A média da sala é "+ mediaSala);
    }
}
