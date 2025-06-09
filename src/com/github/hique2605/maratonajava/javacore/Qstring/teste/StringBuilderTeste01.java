package com.github.hique2605.maratonajava.javacore.Qstring.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {

        // String é imutável, ou seja, não podemos alterar o valor de uma String
        // Quando concatenamos uma String, na verdade estamos criando uma nova String
        // e atribuindo a variável a nova String, ou seja, a variável antiga não é mais
        String nome = "Hique";
        nome = nome.concat(" milioli");
        System.out.println(nome);

        System.out.println("--------------------");

        // StringBuilder é mutável, ou seja, podemos alterar o valor de uma StringBuilder
        // StringBuilder é mais eficiente que String para concatenação de Strings
        // StringBuilder não é sincronizado, ou seja, não é thread-safe, mas é mais rápido
        // StringBuilder é usado quando precisamos manipular Strings de forma eficiente


        StringBuilder sb = new StringBuilder(16); // Capacidade inicial de 16 caracteres
        sb.append("Hique");
        sb.append("Milioli");
        //nao tem concat, mas tem append
        sb.append("OPA");
        System.out.println(sb);


    }
}
