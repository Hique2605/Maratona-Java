package com.github.hique2605.maratonajava.javacore.Hheranca.entidade;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

    private String nome;
    private List<Integer> notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(int nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) return 0.0;

        double soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public String getNome() {
        return nome;
    }

    public List<Integer> getNotas() {
        return notas;
    }
}
