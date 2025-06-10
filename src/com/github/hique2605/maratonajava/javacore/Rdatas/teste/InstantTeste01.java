package com.github.hique2605.maratonajava.javacore.Rdatas.teste;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTeste01 {
    public static void main(String[] args) {


        //sempre usar time zone UTC
        Instant instantNow = Instant.now();
        System.out.println(instantNow);

        Instant instant2 = Instant.ofEpochMilli(1000L);
        System.out.println(instant2);
        Instant instant3 = Instant.ofEpochSecond(1000L);
        System.out.println(instant3);
        Instant instant4 = Instant.ofEpochSecond(1000L, 1000000L);
        System.out.println(instant4);






    }
}
