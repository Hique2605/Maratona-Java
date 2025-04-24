package com.github.hique2605.maratonajava.javacore.Aintroducaoclasses.test;

import com.github.hique2605.maratonajava.javacore.Aintroducaoclasses.model.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        //test1
        Estudante estudante = new Estudante();

        estudante.nome = "Hique";
        estudante.sexo = 'M';
        estudante.idade = 19;
        System.out.println(estudante); // endereco de memoria
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        //test2
        //print null
        Estudante estudante2 = new Estudante();
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);





    }
}
