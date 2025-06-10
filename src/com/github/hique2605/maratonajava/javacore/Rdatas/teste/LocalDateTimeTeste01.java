package com.github.hique2605.maratonajava.javacore.Rdatas.teste;

import java.time.LocalDateTime;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {



        LocalDateTime timenow = LocalDateTime.now();
        System.out.println(timenow);

        LocalDateTime time2 = LocalDateTime.of(2020, 1, 25, 10, 20, 30);
        System.out.println(time2);

        System.out.println(time2.getHour());
        System.out.println(time2.getMinute());
        System.out.println(time2.getSecond());
        System.out.println(time2.getYear());
        System.out.println(time2.getDayOfMonth());
        System.out.println(time2.getDayOfWeek()); //dia semana
        System.out.println(time2.getDayOfYear()); //dia do ano
        System.out.println(time2.getMonthValue()); //mes do ano




    }
}
