package Lista;

import java.util.Arrays;
import java.util.Scanner;

public class Atvd06_07_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();
        System.out.println("Valor com reajuste de 5%: " + valor * 1.05);

        //7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.


        System.out.println("Digite o primeiro valor booleano (true/false): ");
        boolean valor1 = sc.nextBoolean();
        System.out.println("Digite o segundo valor booleano (true/false): ");
        boolean valor2 = sc.nextBoolean();

        if(valor1 == true && valor2 == true ) {
            System.out.println("Ambos os valores são VERDADEIROS");
        }
        else if(valor1 == false && valor2 == false ){
            System.out.println("Ambos os valores são Falsos");
        }
        else {
            System.out.println("os valores são diferentes");
        }

        //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

        System.out.println("digite o A valor: ");
        int A = sc.nextInt();

        System.out.println("digite o B valor: ");
        int B = sc.nextInt();

        System.out.println("digite o C valor: ");
        int C = sc.nextInt();

       int [] nums = {A, B, C};

        Arrays.sort(nums);

        System.out.println("Valores em ordem decrescente: ");
        for (int i = 2; i >=0 ; i--) {
            System.out.println(nums[i]);
        }






        sc.close();
    }
}
