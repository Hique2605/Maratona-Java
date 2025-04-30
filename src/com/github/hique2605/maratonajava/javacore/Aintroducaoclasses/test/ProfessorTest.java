package com.github.hique2605.maratonajava.javacore.Aintroducaoclasses.test;

import com.github.hique2605.maratonajava.javacore.Aintroducaoclasses.entidade.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        //test1
        Professor professor = new Professor();
        //coesao
        professor.nome = "Helo";
        professor.sexo = 'f';
        professor.idade = 19;
        System.out.println(professor); // endereco de memoria
        System.out.println(professor.nome + professor.sexo + professor.idade);




    }
}
