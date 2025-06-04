package Lista;

import java.util.Scanner;

public class Atvd09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Exibe o valor do IMC
        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Verifica a condição de acordo com o IMC
        if (imc < 18.5) {
            System.out.println("Condição: Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Condição: Peso ideal (parabéns)");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Condição: Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Condição: Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Condição: Obesidade grau II (severa)");
        } else if (imc >= 40.0) {
            System.out.println("Condição: Obesidade grau III (mórbida)");
        } else {
            System.out.println("Valor de IMC fora da faixa analisada.");
        }

        scanner.close();




    }
}
