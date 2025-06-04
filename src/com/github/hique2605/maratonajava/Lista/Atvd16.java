package Lista;

import java.util.Scanner;

public class Atvd16 {
    public static void main(String[] args) {

        //16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e
        // verifique se são válidos, determine se o triângulo é
        //equilátero, isósceles ou escaleno.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double lado3 = scanner.nextDouble();

        // Verificação se forma um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

                        // Verifica o tipo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }

        } else {
            System.out.println("Os valores não formam um triângulo válido.");
        }

        scanner.close();






    }
}
