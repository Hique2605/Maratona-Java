package com.github.hique2605.maratonajava.javacore.Vio.teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTeste01 {
    public static void main(String[] args) {

        File file = new File("arquivo.txt");
        try {FileReader fr = new FileReader("arquivo.txt");
            // BufferedReader é usado para ler texto de um fluxo de entrada de forma eficiente
            BufferedReader br = new BufferedReader(fr);
            String linha;

            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
