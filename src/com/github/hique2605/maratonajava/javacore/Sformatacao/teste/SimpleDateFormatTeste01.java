package com.github.hique2605.maratonajava.javacore.Sformatacao.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {

        String pattern1 = " 'Amsterdam' dd/MM/yyyy";
        String pattern = "yyyy-MM-dd G 'at' HH:mm:ss.SSS z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern1);

        System.out.println(sdf.format(new Date()));





    }
}
