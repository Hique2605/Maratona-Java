package com.github.hique2605.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTeste04 {

    public static void main(String[] args) {

        // \d = representa um dígito (0-9)
        // \D = representa um não dígito (qualquer caractere que não seja um dígito)
        // \s = representa um espaço em branco (espaço, tabulação, nova linha, etc.)
        // \S = representa um não espaço em branco (qualquer caractere que não seja um espaço em branco)
        // \w = representa um caractere de palavra (letras, dígitos e sublinhado)
        // \W = representa um não caractere de palavra (qualquer caractere que não seja uma letra, dígito ou sublinhado)
        // [] = define um conjunto de caracteres
        // ? = zero ou uma ocorrência do padrão anterior
        // * = zero ou mais
        // + = uma ou mais ocorrências do padrão anterior
        // {n, m } = entre n e m ocorrências do padrão anterior
        // () = agrupa padrões
        // | = operador lógico "ou" (alternativa)
        //$ = final da linha



       // String regex = "[abcABC]"; // Encontra qualquer ocorrência de 'a', 'b' ou 'c'
       // String regex = "[a-zA-Z]"; // Encontra qualquer letra minúscula ou maiúscula
        String regex = "0 [xX][0-9a-fA-F]"; // Encontra um número hexadecimal de 8 dígitos começando com "0x" ou "0X"

        String texto = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes Encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        int numeroHexadecimal = 0x59F8eA; // Exemplo de número hexadecimal
        System.out.println(numeroHexadecimal);



    }

}
