package com.github.hique2605.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {

       File fielDiretorio = new File("pasta");
       boolean isDiretorio =  fielDiretorio.mkdir();
        System.out.println("Diretório criado: " + isDiretorio);

        File fileArquivoDiretorio = new File("C:\\Users\\hique\\OneDrive\\Desktop\\IdeaProjects\\maratona-java\\pasta\\arquivoPasta.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado no diretório: " + isFileCreated);

        File fileRename = new File(fielDiretorio,"ArquivoRenomeado.txt");
        boolean isRename = fileArquivoDiretorio.renameTo(fileRename);
        System.out.println(isRename);


        File direorioRename = new File ("pastaRenomeada");
        boolean isDiretorioRename = fielDiretorio.renameTo(direorioRename);
        System.out.println("Diretório renomeado: " + isDiretorioRename);



    }



}
