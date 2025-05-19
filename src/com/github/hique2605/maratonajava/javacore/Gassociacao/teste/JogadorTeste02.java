package com.github.hique2605.maratonajava.javacore.Gassociacao.teste;

import com.github.hique2605.maratonajava.javacore.Gassociacao.entidade.Jogador;
import com.github.hique2605.maratonajava.javacore.Gassociacao.entidade.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {

        Jogador jogador01 = new Jogador("Pele");
        jogador01.imprime();

        Time timejg1 = new Time ("Selecao Brasileira");

        jogador01.setTime(timejg1);
        jogador01.imprime();

    }
}
