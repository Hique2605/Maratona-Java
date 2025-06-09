package com.github.hique2605.maratonajava.javacore.Sformatacao.teste;

import java.util.Locale;

public class LocalTeste02 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        //do meu sistema, o padrão é pt_BR

        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }

        System.out.println();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }

    }
}
