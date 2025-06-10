package com.github.hique2605.maratonajava.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeTeste01 {
    public static void main(String[] args) {


        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        LocalTime time2 = LocalTime.of(10, 20, 30);
        System.out.println(time2);
        System.out.println(time2.getHour());
        System.out.println(time2.getMinute());
        System.out.println(time2.getSecond());
        System.out.println(time2.getNano()); //nanosegundos




    }
}
