package com.github.hique2605.maratonajava.introducao;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Hique";
        String endereco = "Rua a n 23";
        double salarioHique = 1000;
        LocalDate dataSalario = LocalDate.of(2025, 4, 23);
        //ou LocalDate dataSalario = LocalDate.parse("2025-05-18");
        System.out.println(dataSalario);
    }



}
