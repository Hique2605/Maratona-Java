package com.github.hique2605.maratonajava.javacore.Minterfaces.entidade;

public interface DataLoader {
    //sem final

    //interface criada para prover implementacao contrato
    //public abstract vem padrao
    void load();

    default void checkPermission(){
        System.out.println("Check de permissao");
    }


    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe ");
    }
}
