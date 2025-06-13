package com.github.hique2605.maratonajava.javacore.Uregex.teste;

public class ScannerTeste01 {
    public static void main(String[] args) {

        String texto = "Levi, Erem, Mikasa, true , 200";
        String[] nomes = texto.split(",");


        for (String nome : nomes) {
            nome = nome.trim(); // Remove espaços em branco extras
            System.out.println(nome);
        }





    }
}