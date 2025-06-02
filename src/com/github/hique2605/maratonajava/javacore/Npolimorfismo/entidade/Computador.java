package com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade;

public class Computador extends Produto{


    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    public static final double IMPOSTO = 0.21;

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO;
    }

}

