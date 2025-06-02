package com.github.hique2605.maratonajava.javacore.Npolimorfismo.teste;

import com.github.hique2605.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {

        //RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
        //repositorioBancoDeDados.salvar();
        //aparece console salvando em bc

        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        System.out.println("---------------------");
        Repositorio repositorio2 = new RepositorioMemoria();
        repositorio2.salvar();
        System.out.println("---------------------");
        Repositorio repositorio3 = new RepositorioArquivo();
        repositorio3.salvar();
        System.out.println("---------------------");

        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Goku 2");
        System.out.println(list);

    }
}
