package com.github.hique2605.maratonajava.javacore.Qstring.teste;

public class StringTeste02 {
    public static void main(String[] args) {

    String nome = "Luffy";
    String numeros = "0123456789";

        System.out.println(nome.charAt(0)); // L
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l")); // Luppy
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.trim()); // Remove espaços no início e no fim da String


        System.out.println("--------------------");

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 3)); // 012
        System.out.println(numeros.substring(5, numeros.length()));//56789


    }

}
