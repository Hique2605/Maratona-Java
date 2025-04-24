package com.github.hique2605.maratonajava.javacore.Aintroducaoclasses.test;

import com.github.hique2605.maratonajava.javacore.Aintroducaoclasses.model.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.nome = "GOLF";
        carro1.modelo = "gti 2.0";
        carro1.ano = 1975;

        Carro carro2 = new Carro();
        carro2.nome = "Palio";
        carro2.modelo = "1.0";
        carro2.ano = 2005;

        // carro1 = carro2;

        System.out.println(carro1); // endereco de memoria
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);


        System.out.println(carro2); // endereco de memoria
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);







    }
}
