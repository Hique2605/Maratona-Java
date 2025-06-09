package com.github.hique2605.maratonajava.javacore.Sformatacao.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {

        NumberFormat[] numberFormats = new NumberFormat[4];

        Locale brasil = new Locale("pt", "BR");
        Locale eua = Locale.US;
        Locale japao = Locale.JAPAN;
        Locale frança = Locale.FRANCE;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(brasil);
        nfa[1] = NumberFormat.getInstance(eua);
        nfa[2] = NumberFormat.getInstance(japao);
        nfa[3] = NumberFormat.getInstance(frança);
        double valor = 1234567.89;

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }




    }
}
