package com.github.hique2605.maratonajava.javacore.Npolimorfismo.servico;

import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Computador;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Produto;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Tomate;

public class CalculadoraImposto {
/* aula 90 ,91
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador: " + computador.getNome() + " é: " + imposto);
        System.out.println("Valor do computador:    " + computador.getValor());
        System.out.println("imposto a ser pago: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do Tomate: " + tomate.getNome() + " é: " + imposto);
        System.out.println("Valor do Tomate:    " + tomate.getValor());
        System.out.println("imposto a ser pago: " + imposto);
    }
*/      //aula 92
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Imposto do produto: " + produto.getNome() + " é: " + imposto);
        System.out.println("Valor do produto:    " + produto.getValor());
        System.out.println("imposto a ser pago: " + imposto);

        if(produto instanceof Tomate) { //verifica se o produto é do tipo tomate
            Tomate tomate = (Tomate) produto; //casting
            System.out.println("Data de validade do tomate: " + tomate.getDataValidade());
            }

    }



}
