package com.github.hique2605.maratonajava.javacore.Lclassesabstratas.teste;

import com.github.hique2605.maratonajava.javacore.Lclassesabstratas.entidade.Desenvolvedor;
import com.github.hique2605.maratonajava.javacore.Lclassesabstratas.entidade.Funcionario;
import com.github.hique2605.maratonajava.javacore.Lclassesabstratas.entidade.Gerente;

public class TesteFuncionario01 {
    public static void main(String[] args) {
            //clase abstrata
        //Funcionario funcionario01 = new Funcionario("Zoro",2000);
        //System.out.println(funcionario01);

        Gerente gerente01 = new Gerente("Nami",5000);
        System.out.println(gerente01);

        Desenvolvedor desenvolvedor = new Desenvolvedor("ZED",5000);
        System.out.println(desenvolvedor);

    }
}
