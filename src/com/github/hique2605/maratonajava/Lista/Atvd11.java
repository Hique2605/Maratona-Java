package Lista;

import java.util.Scanner;

public class Atvd11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //11 - Faça um algoritmo que leia quatro notas obtidas por um aluno,
        // calcule a média das nota obtidas, imprima na tela o nome do aluno e
        // se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado
        // sua média final deve ser maior ou igual a 7.

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        double [] arrayNotas = new double[4];
        double sum = 0;

        for (int i = 0 ; i < arrayNotas.length ; i++){
            System.out.println("Digite a nota " + (i + 1) + ": ");
            arrayNotas[i] = sc.nextDouble();
            sum += arrayNotas[i];
        }
        if (sum >= 7 ){
            System.out.println("O aluno " + nomeAluno + " foi aprovado com média: " + (sum / arrayNotas.length));
        } else {
            System.out.println("O aluno " + nomeAluno + " foi reprovado com média: " + (sum / arrayNotas.length));
        }









        sc.close();
    }
}
