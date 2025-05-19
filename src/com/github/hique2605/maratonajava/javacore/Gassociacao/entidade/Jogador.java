package com.github.hique2605.maratonajava.javacore.Gassociacao.entidade;

public class Jogador {

    private String nome;
    private Time time;

    public void imprime(){
        System.out.println(this.nome);
        if (time != null){
            System.out.println(time.getNome());
        }

    }
    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Jogador(Time time, String nome) {
        time = time;
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
