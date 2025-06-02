package com.github.hique2605.maratonajava.javacore.Npolimorfismo.teste;

import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Computador;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Produto;
import com.github.hique2605.maratonajava.javacore.Npolimorfismo.entidade.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("------------------------");
        Produto produto2 = new Tomate("AMERICANO", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());



    }
}
