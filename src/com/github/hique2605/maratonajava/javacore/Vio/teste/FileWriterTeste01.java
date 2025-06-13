package com.github.hique2605.maratonajava.javacore.Vio.teste;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args) {


        // FileWriter é usado para escrever caracteres em arquivos de texto
        // Ele não deve ser usado para escrever bytes, pois pode causar problemas de codificação

        // Exemplo de uso do FileWriter:
         try (FileWriter writer = new FileWriter("arquivo.txt")) {
             writer.write("Olá, mundo!,CLASSE WRITTER");
             writer.flush();
         } catch (IOException e) {
             e.printStackTrace();
         }

        System.out.println("FileWriter é usado para escrever caracteres em arquivos de texto.");








    }
}
