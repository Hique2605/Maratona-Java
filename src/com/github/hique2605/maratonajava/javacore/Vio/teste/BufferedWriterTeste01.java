package com.github.hique2605.maratonajava.javacore.Vio.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {

        // Exemplo de uso do BufferedWriter:
        File file = new File("arquivo.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Olá, mundo!,CLASSE BUFFERWRITTER");
            bw.newLine(); // Adiciona uma nova linha
            bw.write("Escrevendo mais uma linha com BufferedWriter.");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }








    }
}
