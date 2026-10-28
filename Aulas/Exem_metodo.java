public class Exem_metodo {
    public static void main(String[] args) {
        System.out.println("Antes de chamar o método");
        ImprimirInformacoes();
        System.out.println("Depois de imprimir infirmações");
        Depois();
    }

    public static void ImprimirInformacoes() {
        System.out.println("============================");
        System.out.println("Logica de Programação");
        System.out.println("Aprendendo a programar");
        System.out.println("Like a boss!!");
        System.out.println("============================");   
    }
    public static void Depois(){
                Double numero = 10.0;
        Double calculo = 0.0;

        while (numero <= 20){
            calculo = numero / 2;
            System.out.println(calculo);
            numero++;
        }

    }
    
}
