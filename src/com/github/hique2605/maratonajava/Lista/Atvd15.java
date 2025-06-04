package Lista;

import java.util.Scanner;

public class Atvd15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu,
    // imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
        //consideração o ano com 365 dias e o mês com 30 dias. (Ex: 5 anos, 2 meses e 15 dias de vida)

        System.out.println("Digite o ano em que você nasceu: ");
        int anoNascimento = sc.nextInt();

        int anoAtual = 2025;
        int idadeAnos = anoAtual - anoNascimento;

        int totalDias = idadeAnos * 365;
        int meses = totalDias / 30;
        int dias = totalDias % 30;

        int mesesRestantes = meses % 12;

        System.out.println("Você viveu aproximadamente: " + idadeAnos + " anos, " + mesesRestantes + " meses e " + dias + " dias.");


        sc.close();
    }
}
