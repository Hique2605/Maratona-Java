package Lista;

import java.util.Scanner;

public class Atvd01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*1 - Faça um algoritmo que leia os valores de A, B, C
        e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.*/

        System.out.println("Digite o valor de A: ");
        double A = sc.nextDouble();

        System.out.println("Digite o valor de B: ");
        double B = sc.nextDouble();

        System.out.println("Digite o valor de C: ");
        double C = sc.nextDouble();

        System.out.println("SOMA DE A E B:");
        double sumAB =A + B;
        System.out.println(sumAB);

        if (sumAB > C){
            System.out.println("A soma de a b é maior que C: soma = "+ sumAB + " valor de C = " +C);
        }
        else {
            System.out.println("A soma de A e B é menor igual que C: soma = "+ sumAB + " valor de C = " +C);
        }


        sc.close();
    }




}
