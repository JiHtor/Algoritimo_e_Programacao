public class exe_func {
    public static void main(String[] args) { 
        System.out.println("Realizando o calculo com dois numeros"); 
        calcular(50, 10);
        System.out.println("Fim do calculo");
        calc(4, 6);
        }

    public static void calcular(int n1, int n2) {
        int resultado = ((n1 * n2) - (n1 + n2)) / (n1 - n2); 
        System.out.println("Resultado da equacao: " + resultado);
    }  

    public static void calc(int n, int nn){
        int resultado = n + nn;
        System.out.println("O resultado é " +resultado);
    }
}