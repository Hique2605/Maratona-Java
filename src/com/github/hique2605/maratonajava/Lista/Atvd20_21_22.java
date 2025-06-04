package Lista;

import java.util.Random;
import java.util.Scanner;

public class Atvd20_21_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.


        System.out.println("Digite um número inteiro para ver sua tabuada: ");
        int i = sc.nextInt();

            System.out.println("Tabuada do " + i + ":");
            for(int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

        //21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

        Random random = new Random();

        int numero = random.nextInt(101);
        System.out.println("Número aleatório entre 0 e 100: " + numero);

        //para senha use SecureRandom

        //22 - Faça um algoritmo que leia dois valores inteiros A e B,
        // imprima na tela o quociente e o resto da divisão inteira entre eles.

        System.out.println("Digite o valor de A: ");
        int A = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = sc.nextInt();

        double temp = A % B;
        System.out.println("resto da A / B = " + temp);
        System.out.println("quociente A / B = " + (A / B));


        sc.close();
    }
}
