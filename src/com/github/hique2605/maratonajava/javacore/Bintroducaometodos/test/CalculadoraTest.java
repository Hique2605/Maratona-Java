package com.github.hique2605.maratonajava.javacore.Bintroducaometodos.test;

import com.github.hique2605.maratonajava.javacore.Bintroducaometodos.model.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        //aula 47
        //calculadora.somaDoisNumeros();
        //calculadora.subtraiDoisNumeros();
        //calculadora.multiplicaDoisNumeros(2,2);
        // double resultado = calculadora.divideDoisNumeros(10,0);
        //int resultado = (int) calculadora.divideDoisNumeros(10,2);
        // System.out.println(resultado);
        //calculadora.imprimeDivisaoDeDoisNumeros(86,0);


        //aula 48

        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("Dentro do main");
        System.out.println(num1);
        System.out.println(num2);






    }
}
