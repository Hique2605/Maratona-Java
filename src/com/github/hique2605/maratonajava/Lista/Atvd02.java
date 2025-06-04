package Lista;

import java.util.Scanner;

public class Atvd02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2 - Faça um algoritmo para receber um número qualquer
        // e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
            //verifica par e impar
        if (num % 2 == 0){
            System.out.println("O número " + num + " é PAR.");
        } else {
            System.out.println("O número " + num + " é ÍMPAR.");
        }
            //verifica positivo ou negativo
        if (num >= 0) {
            System.out.println("O número " + num + " é Positivo.");
        } else {
            System.out.println("O número " + num + " é Negativo.");
        }

        sc.close();
    }
}
