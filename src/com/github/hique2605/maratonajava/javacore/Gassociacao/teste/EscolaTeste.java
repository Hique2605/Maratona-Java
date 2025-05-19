package com.github.hique2605.maratonajava.javacore.Gassociacao.teste;

import com.github.hique2605.maratonajava.javacore.Gassociacao.entidade.Escola;
import com.github.hique2605.maratonajava.javacore.Gassociacao.entidade.Professor;

public class EscolaTeste {
    public static void main(String[] args) {

        Professor professorA = new Professor("MATHEUS");
        Professor professorB = new Professor("DEVDOJO");
        Professor professorC = new Professor("ninja");
        Professor professorD = new Professor("Luciano");

        Professor[] professores = {professorA,professorB,professorC, professorD};
        Escola escola = new Escola("UDEMY",professores);
        escola.imprime();


    }
}
