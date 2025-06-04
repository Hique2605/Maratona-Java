package Lista;

import java.util.Scanner;

public class Atvd03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       // 3 - Faça um algoritmo que leia dois valores inteiros A e B,
        // se os valores de A e B forem iguais, deverá somar os dois valores,

       // caso contrário devera multiplicar A por B.
        // Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e

       // imprimir seu valor na tela.

        System.out.println("Digite o valor de A: ");
        double A = sc.nextDouble();

        System.out.println("Digite o valor de B: ");
        double B = sc.nextDouble();

        double resultado = 0;

        if(A == B){
           resultado = A + B;
            System.out.println(resultado);
        }
        else {
           resultado = A * B;
            System.out.println(resultado);
        }

        double c = resultado;
        System.out.println("O valor de C é: " + c);

        sc.close();
    }
}
