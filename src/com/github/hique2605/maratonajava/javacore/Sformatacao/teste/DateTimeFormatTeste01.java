package com.github.hique2605.maratonajava.javacore.Sformatacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatTeste01 {
    public static void main(String[] args) {

        //formatacao todas vezes que tem format, esta transformando o objeto em String
        //toda vez que tem parse, esta transformando String em objeto

        LocalDate date = LocalDate.now();
        date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(date);

        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-----------------------");

        LocalDate parse1 = LocalDate.parse("2023-10-05", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate parse2 = LocalDate.parse("20231005", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse3 = LocalDate.parse("05/10/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);




    }
}
