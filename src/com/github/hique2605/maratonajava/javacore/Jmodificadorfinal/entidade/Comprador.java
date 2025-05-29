package com.github.hique2605.maratonajava.javacore.Jmodificadorfinal.entidade;

public class Comprador {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
