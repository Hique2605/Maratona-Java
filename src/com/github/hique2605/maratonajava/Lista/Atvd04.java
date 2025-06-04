package Lista;

import java.util.Scanner;

public class Atvd04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        int antecessor  = num - 1;
        int sucessor  = num + 1;

        System.out.println(antecessor);
        System.out.println(num);
        System.out.println(sucessor);

        sc.close();
    }
}
