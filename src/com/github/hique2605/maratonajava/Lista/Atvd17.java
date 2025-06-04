package Lista;

import java.util.Scanner;

public class Atvd17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
        // Imprima na tela as duas temperaturas.
        //Fórmula: C = (5 * ( F-32) / 9)

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempFahrenheit = sc.nextDouble();

        double tempCelsius = (5 * (tempFahrenheit - 32)) / 9;

        System.out.println("Temperatura em Fahrenheit: " + tempFahrenheit);
        System.out.println("Temperatura em Celsius: " + tempCelsius);


    }
}
