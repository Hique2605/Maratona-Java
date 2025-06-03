package com.github.hique2605.maratonajava.javacore.Oexception.teste;

public class RuntimeExceptionTeste01 {
    public static void main(String[] args) {
        // Abaixo temos um exemplo de ArrayIndexOutOfBoundsException
        //int[] array = new int[3];
        //System.out.println(array[3]);

        // Abaixo temos um exemplo de NullPointerException
         String nome = null;
        System.out.println(nome.toLowerCase());

        // Abaixo temos um exemplo de NumberFormatException
        // String numero = "10a";
        // int num = Integer.parseInt(numero);
    }
}
