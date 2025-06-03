package com.github.hique2605.maratonajava.javacore.Oexception.teste;

import com.github.hique2605.maratonajava.javacore.Oexception.runtiem.teste.entidade.Leitor1;
import com.github.hique2605.maratonajava.javacore.Oexception.runtiem.teste.entidade.Leitor2;

import java.io.*;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
        lerAquivo();
    }


    public static void lerAquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
            // Simula leitura do arquivo
            System.out.println("Lendo arquivo...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // O bloco finally não é necessário aqui, pois o try-with-resources já fecha os recursos automaticamente.) {
        }
    }


/*
    public static void lerArquivo2(){

        Reader reader = null;
        try {
        reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException  e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader!= null){
                    reader.close();
                }
            }catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }
*/

}


