package com.github.hique2605.maratonajava.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTeste01 {
    public static void main(String[] args) {

        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate date2 = LocalDate.of(2020, 1, 25);
        System.out.println(date2);

        System.out.println(date2.getYear());
        System.out.println(date2.getDayOfWeek()); //dia semana
        System.out.println(date2.lengthOfMonth()); //quantidade de dias no mes
        System.out.println(date2.isLeapYear()); //ano bissexto
        System.out.println(date2.getDayOfYear()); //dia do ano

    }
}
