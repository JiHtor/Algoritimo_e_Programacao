package Exercicios7;

public class ExercicioVetores {

    // (a) Retorna o maior valor do vetor
    public static int obterMaior(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }
    // (b) Retorna o menor valor do vetor
    public static int obterMenor(int[] vetor) {
        int min = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            }
        }
        return min;
    }

    // (c) Retorna a média entre o maior e o menor valor
    public static double obterMediaExtremos(int[] vetor) {
        int max = obterMaior(vetor);
        int min = obterMenor(vetor);
        return (double) (max + min) / 2;
    }
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 7};
        System.out.println("Maior: " + obterMaior(numeros));       
        System.out.println("Menor: " + obterMenor(numeros));           
        System.out.println("Média dos Extremos: " + obterMediaExtremos(numeros));
    }
}