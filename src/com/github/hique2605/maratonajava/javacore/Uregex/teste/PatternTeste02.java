package com.github.hique2605.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTeste02 {

    public static void main(String[] args) {

        // \d // representa um dígito (0-9)
        // \D // representa um não dígito (qualquer caractere que não seja um dígito)
        // \s // representa um espaço em branco (espaço, tabulação, nova linha, etc.)
        // \S // representa um não espaço em branco (qualquer caractere que não seja um espaço em branco)
        // \w // representa um caractere de palavra (letras, dígitos e sublinhado)
        // \W // representa um não caractere de palavra (qualquer caractere que não seja uma letra, dígito ou sublinhado)

        String regex = "\\D";

        String texto = "@#hh_j2 12 gvh21";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes Encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }





    }

}
