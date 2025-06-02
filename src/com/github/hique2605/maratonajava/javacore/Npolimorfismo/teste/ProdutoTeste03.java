package com.github.hique2605.maratonajava.javacore.Npolimorfismo.teste;

import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Computador;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Produto;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Tomate;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);



        Tomate tomate = new Tomate("AMERICANO", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
