package Lista;

import java.util.Scanner;

public class Atvd05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //- Faça um algoritmo que leia o valor do salário mínimo
        // e o valor do salário de um usuário, calcule quantos salários mínimos esse
        //
        //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).


        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.println("Digite o valor do salário do usuário: ");
        double salarioUsuario = sc.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo ;
        System.out.println("Quantidade de salario minimo que o usuario ganha é de : " + quantidadeSalariosMinimos);



        sc.close();
    }
}
