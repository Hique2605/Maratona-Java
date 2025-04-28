package com.github.hique2605.maratonajava.javacore.Bintroducaometodos.test;

import com.github.hique2605.maratonajava.javacore.Bintroducaometodos.model.Estudante;
import com.github.hique2605.maratonajava.javacore.Bintroducaometodos.model.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
    /*          AULA 50
        ImpressoraEstudante impresora = new ImpressoraEstudante();
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Hique";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "Amalia";
        estudante2.idade = 1;
        estudante2.sexo = 'f';

        impresora.imprime(estudante1);

        impresora.imprime(estudante2);
    */

        //AULA 51

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Hique";
        estudante1.idade = 19;
        estudante1.sexo = 'M';

        estudante2.nome = "Amalia";
        estudante2.idade = 1;
        estudante2.sexo = 'f';

        estudante1.imprime();
        estudante2.imprime();


    }

}
