package com.github.hique2605.maratonajava.javacore.Sformatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTeste01 {
    public static void main(String[] args) {

        // pt-BR
        Locale localeItalia = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");

        Calendar calendario = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        System.out.println("Data completa na Italia: " + df1.format(calendario.getTime()));
        System.out.println("Data completa na Suica: " + df2.format(calendario.getTime()));




    }
}
