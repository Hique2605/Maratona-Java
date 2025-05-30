package com.github.hique2605.maratonajava.javacore.Minterfaces.entidade;

public class DatabaseLoader implements DataLoader, DataRemover {


    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("deletando dados do banco de dados");
    }
    /*@Override nn pode ser sebrescrito
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface ");
    }*/
}
