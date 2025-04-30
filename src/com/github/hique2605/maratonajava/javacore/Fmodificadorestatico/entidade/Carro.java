package com.github.hique2605.maratonajava.javacore.Fmodificadorestatico.entidade;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }
    //colocar static quando os metodos nao acessam uma variavel, um atributo da instancia
    //quando nao acessam o atributo da instancia

    public void imprime(){
        System.out.println("----------");
        System.out.println("nome: "+this.nome);
        System.out.println("velocidade Maxima: "+this.velocidadeMaxima);
        System.out.println("velocidade limite: "+Carro.velocidadeLimite);
    }


    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static Double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }



}
