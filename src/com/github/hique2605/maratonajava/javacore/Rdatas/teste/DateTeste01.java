package com.github.hique2605.maratonajava.javacore.Rdatas.teste;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {

        Date date = new Date(1_000_000L); //long 100000
        //praticamente obsoleta
        //sistema legado
        System.out.println(date);

        System.out.println("---------------------");

        Date date2 = new Date();
        System.out.println(date2.getTime());





    }
}
