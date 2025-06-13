package com.github.hique2605.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste01 {
    public static void main(String[] args) {

        try {
            File file = new File("arquivo.txt");
            FileReader fileReader = new FileReader(file);
            //System.out.println(fileReader.read());  //79 - retorna o código ASCII do primeiro caractere

            int i;
            while ((i = fileReader.read()) != -1) { // Lê o arquivo até o final
                System.out.print((char) i); // Converte o código ASCII para caractere e imprime
            }



            /*  char[] buffer = new char[30];
            fileReader.read(buffer);
            for (char c : buffer) {
                System.out.print(c); // Imprime os caracteres lidos
            }
                */
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
