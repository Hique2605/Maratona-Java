package Lista;

import java.util.Scanner;

public class Atvd10 {
    public static void main(String[] args) {

        //10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

        Scanner sc = new Scanner(System.in);
        double sum = 0;
            for (int i = 0 ; i<3 ; i++){

                System.out.print("Digite a nota " + (i + 1) + ": ");
                double nota = sc.nextDouble();
                sum = sum + nota;
        }

        System.out.println(sum / 3);

                //com array
            double [] arrayNotas = new double[3];
            sum = 0;

            for (int i = 0 ; i < arrayNotas.length ; i++){
                System.out.println("Digite a nota " + (i + 1) + ": ");
                arrayNotas[i] = sc.nextDouble();
                sum += arrayNotas[i];
            }
        System.out.println("Media das notas: " + (sum / arrayNotas.length));







        sc.close();
    }
}
