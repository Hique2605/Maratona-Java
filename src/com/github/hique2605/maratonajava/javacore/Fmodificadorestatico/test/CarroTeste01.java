package com.github.hique2605.maratonajava.javacore.Fmodificadorestatico.test;

import com.github.hique2605.maratonajava.javacore.Fmodificadorestatico.entidade.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(150);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("MERCEDES", 250);
        Carro c3 = new Carro("AUDI", 290);

        //  c1.setVelocidadeLimite(180); se fizer isso os 3 tem como limite 180 ,com static la

        // cpm public sem set e get
        //Carro.velocidadeLimite = 180;


        c1.imprime();
        c2.imprime();
        c3.imprime();



    }
}
