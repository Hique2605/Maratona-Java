package com.github.hique2605.maratonajava.javacore.Gassociacao.teste;

import com.github.hique2605.maratonajava.javacore.Gassociacao.entidade.Jogador;

public class JogadorTeste {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("CR7");
        Jogador jogador3 = new Jogador("NJ JR");

        //Instaciar Array
        // ou Jogador[] jogadores = new Jogador[3];

        //OU
        //Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};
        //Jogador[] jogadores2 = {jogador1,jogador2,jogador3};

        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};
        //imprimir
        for (Jogador jogador : jogadores){
            jogador.imprime();
        }



    }
}

