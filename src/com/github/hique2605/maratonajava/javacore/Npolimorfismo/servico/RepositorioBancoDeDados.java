package com.github.hique2605.maratonajava.javacore.Npolimorfismo.servico;

import com.github.hique2605.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados  implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados");
    }
}
