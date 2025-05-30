package com.github.hique2605.maratonajava.javacore.Minterfaces.entidade;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo ");
    }

    @Override
    public void remove() {
        System.out.println("removendo dados de um arquivo ");
    }
}
