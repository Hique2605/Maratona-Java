package com.github.hique2605.maratonajava.javacore.Rdatas.teste;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurantionTeste01 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfter = LocalDateTime.now().plusYears(2);
        System.out.println(now);
        System.out.println(nowAfter);
        Duration duration = Duration.between(now, nowAfter); //diferenca entre dois objetos LocalDateTime
        System.out.println("Duration: " + duration);
        System.out.println("Duration in days: " + duration.toDays());
        System.out.println("Duration in hours: " + duration.toHours());
        System.out.println("Duration in minutes: " + duration.toMinutes());
        System.out.println("Duration in seconds: " + duration.getSeconds());




    }
}
