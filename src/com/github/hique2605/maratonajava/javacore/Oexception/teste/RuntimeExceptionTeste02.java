package com.github.hique2605.maratonajava.javacore.Oexception.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(1, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do catch");
            e.printStackTrace();
        } finally {
            System.out.println("Finally sempre é executado");
        }
    }

    private static int divisao(int a, int b) throws IllegalArgumentException{
        if(b == 0) {
            throw new IllegalArgumentException("Argumento inválido, o valor de b não pode ser 0");
        }
        return a/b;
    }


}



