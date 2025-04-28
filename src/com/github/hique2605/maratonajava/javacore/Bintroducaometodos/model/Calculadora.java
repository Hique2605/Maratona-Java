package com.github.hique2605.maratonajava.javacore.Bintroducaometodos.model;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(12 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        if (num1 > 5) {
            System.out.println(num1 * num2);
        } else System.out.println("num invalido");
    }

    public double divideDoisNumeros(double num1, double num2) {
        //  return (int) num1/num2; casting, para int no caso
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {

        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {

        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do metodo : "
                + "\nNum 1: " + numero1

                + "\nNum 2: " + numero2
        );

    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    //sintaxe diferente mas transforma em array
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}




