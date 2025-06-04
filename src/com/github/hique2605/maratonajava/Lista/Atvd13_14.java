package Lista;

import java.util.Scanner;

public class Atvd13_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //13 - Faça algoritmo que leia o nome e a idade de uma peso e
        // imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

        System.out.println("Digite o nome da pessoa: ");
        String nomePessoa = sc.nextLine();

        System.out.println("Digite a idade da pessoa: ");
        int idadePessoa = sc.nextInt();

        System.out.println("Digite o peso da pessoa: ");
        double pesoPessoa = sc.nextDouble();

        if (idadePessoa >= 18 ){
            System.out.println("A pessoa " + nomePessoa + " é maior de idade.");
        } else {
            System.out.println("A pessoa " + nomePessoa + " é menor de idade.");
        }

        //14 - Faça um algoritmo que receba um valor A e B,
        // e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

        System.out.println("Digite o valor de A: ");
        double A = sc.nextDouble();

        System.out.println("Digite o valor de B: ");
        double B = sc.nextDouble();

        double temp = A;
        A = B;
        B = temp;
        System.out.println("Valor de a e b trocado: A = " + A + ", B = " + B);











        sc.close();
    }
}
