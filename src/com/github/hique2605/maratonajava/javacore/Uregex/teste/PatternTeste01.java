package com.github.hique2605.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTeste01 {

    public static void main(String[] args) {

        String regex = "aba";

        //String texto = "abaaba";
        String texto2 = "abababa";

        // Verifica se o texto contém a sequência "ab"
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes Encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }





    }

}
