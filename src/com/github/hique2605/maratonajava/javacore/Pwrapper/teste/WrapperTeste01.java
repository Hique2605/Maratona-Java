package com.github.hique2605.maratonajava.javacore.Pwrapper.teste;

import java.util.List;

public class WrapperTeste01 {
    public static void main(String[] args) {

        // wrappers são classes que encapsulam tipos primitivos
        // e permitem que sejam tratados como objetos

        byte byteP =1;
        short shortP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 1.0f;
        double doubleP = 1.0;
        char charP = 'A';
        boolean booleanP = true;

        // Wrappers
        Byte byteW = 127; // valor máximo de um byte é 127
        Short shortW = 2;
        Integer intW = 2; //auto-boxing - convertendo de int para Integer
        Long longW = 2L;
        Float floatW = 2.0f;
        Double doubleW = 2D; // D é opcional, mas é uma boa prática usar para diferenciar de float
        Character charW = 'B';
        Boolean booleanW = true;

        //List < int > nn funciona, pois int é um tipo primitivo
        List<Integer> lista;

        int i = intW; // Unboxing - convertendo de Integer para int

        Integer intW2 = Integer.parseInt("1");

        boolean verdade = Boolean.parseBoolean("true");
        System.out.println(verdade);


        System.out.println(Character.isDigit('A')); // Verifica se o caractere é um dígito
        System.out.println(Character.isDigit('9')); // Verifica se o caractere é um dígito
        System.out.println(Character.isLetter('A')); // Verifica se o caractere é uma letra
        System.out.println(Character.isLetter('1')); // Verifica se o caractere é uma letra


        System.out.println("---------------------");
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));


    }
}
