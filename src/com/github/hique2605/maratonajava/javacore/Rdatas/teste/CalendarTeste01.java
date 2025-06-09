package com.github.hique2605.maratonajava.javacore.Rdatas.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        //é abstrato, não pode ser instanciado


        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("O primeiro dia da semana é domingo");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 5);

        Date date = calendar.getTime();
        System.out.println(date);



    }
}
