package com.github.hique2605.maratonajava.javacore.Minterfaces.Teste;

import com.github.hique2605.maratonajava.javacore.Minterfaces.entidade.DataLoader;
import com.github.hique2605.maratonajava.javacore.Minterfaces.entidade.DatabaseLoader;
import com.github.hique2605.maratonajava.javacore.Minterfaces.entidade.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {


        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        //databaseLoader.retrieveMaxDataSize();

    }
}
