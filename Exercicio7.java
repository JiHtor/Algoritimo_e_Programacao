/*
Faça um algoritmo para imprimir em cada linha o resultado 	lógico das seguintes expressões:
((120 - 30) = (3 ˆ 30))
(não ((20 módulo 4)= 1) ou (9!= 9))
((5 módulo 2 ) > 3)
(a = A)
*/

//Feito por: Heitor Soares da Silva

public class Exercicio7 {
    public static void main (String [] agrs){
        boolean p1 = (120 - 30) == (Math.pow(3,30));
        boolean p2 = !((20 % 4) == 1) || (9!= 9);
        boolean p3 = ((5 % 2) >3);
        boolean p4 = ("a" == "A");

        System.out.println("O resultado é "+p1);
        System.out.println("O resultado é "+p2);
        System.out.println("O resultado é "+p3);
        System.out.println("O resultado é "+p4);       
    }
    
}
