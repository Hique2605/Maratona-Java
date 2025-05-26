package com.github.hique2605.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraTeclado01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("escreva seu nome:");
        String nome = sc.nextLine();
        System.out.println(nome);

        System.out.println("----------");

        System.out.println("escreva sua idade:");
        int idade = sc.nextInt();
        System.out.println(idade);

        System.out.println("escreva seu sexo f ou m :");
        char sexo = sc.next().charAt(0);
        System.out.println(sexo);

        System.out.println("---------------------");
        System.out.println("PESSOA:");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);


    sc.close();
    }


}
