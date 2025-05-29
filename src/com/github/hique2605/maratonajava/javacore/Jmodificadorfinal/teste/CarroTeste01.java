package com.github.hique2605.maratonajava.javacore.Jmodificadorfinal.teste;

import com.github.hique2605.maratonajava.javacore.Jmodificadorfinal.entidade.Carro;
import com.github.hique2605.maratonajava.javacore.Jmodificadorfinal.entidade.Comprador;
import com.github.hique2605.maratonajava.javacore.Jmodificadorfinal.entidade.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("GUI");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("puro sangue");
        ferrari.imprime();


    }
}
