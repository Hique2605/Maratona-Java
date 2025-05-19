package com.github.hique2605.maratonajava.javacore.Gassociacao.teste;

import com.github.hique2605.maratonajava.javacore.Gassociacao.entidade.Jogador;
import com.github.hique2605.maratonajava.javacore.Gassociacao.entidade.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {

        Time time = new Time("SELECAO BRASIL");
        Jogador jogador = new Jogador("CAFU");
        Jogador jogador2 = new Jogador("PELE");
        Jogador[] jogadores = {jogador,jogador2};


        jogador.setTime(time);
        jogador2.setTime(time);


        time.setJogadores(jogadores);

        System.out.println("---jogador 1---");
        jogador.imprime();
        System.out.println("---jogador 2---");
        jogador2.imprime();

        System.out.println("---time---");
        time.imprime();



    }
}
