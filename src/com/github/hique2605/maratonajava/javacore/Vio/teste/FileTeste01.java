package com.github.hique2605.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste01 {
    public static void main(String[] args) {

        File file = new File("file.txt");
        try {
           boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreated);
            System.out.println("Nome do arquivo: " + file.getName());
            System.out.println("Caminho absoluto: " + file.getAbsolutePath());
            System.out.println("Caminho relativo: " + file.getPath());
            System.out.println("Pode ler: " + file.canRead());
            System.out.println("Pode escrever: " + file.canWrite());
            System.out.println("Pode executar: " + file.canExecute());
            System.out.println("Tamanho do arquivo: " + file.length() + " bytes");
            System.out.println("É um diretório: " + file.isDirectory());
            System.out.println("É um arquivo: " + file.isFile());
            System.out.println("É oculto: " + file.isHidden());
            System.out.println("Última modificação: " + file.lastModified());
            System.out.println("Lista de arquivos no diretório: ");


            // Verifica se o arquivo existe
            boolean exists = file.exists();
            if (exists) {
                boolean isDeleted = file.delete();
                System.out.println("Arquivo deletado: " + isDeleted);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
