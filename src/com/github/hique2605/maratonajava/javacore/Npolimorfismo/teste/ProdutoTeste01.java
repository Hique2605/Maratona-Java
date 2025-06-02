package com.github.hique2605.maratonajava.javacore.Npolimorfismo.teste;

import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Computador;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Televisao;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Tomate;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {

        Computador computador = new Computador("Macbook Pro", 10000);
        Tomate tomate = new Tomate("Tomate Italiano", 10);
        Televisao tv = new Televisao("Samsung 4K", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
