package com.github.hique2605.maratonajava.javacore.Csobrecargametodos.model;

public class Anime {

    private String nome;
    private String tipo;
    private int ep;
    private String genero;

    public Anime(String nome, int ep, String tipo, String genero) {
        this.nome = nome;
        this.ep = ep;
        this.tipo = tipo;
        this.genero = genero;
    }



   /* //Aula sobrecarga de metodo
    public void init(String nome , String tipo , int ep){
        this.nome = nome;
        this.tipo = tipo;
        this.ep = ep;
    }
    //Aula sobrecarga de metodo
    public void init(String nome , String tipo , int ep, String genero){
        this.init(nome,tipo,ep);
        this.genero = genero;
    }
*/


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.ep);
        System.out.println(this.genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }
}
