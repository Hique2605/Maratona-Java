package com.github.hique2605.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *

        int num1 = 10;
        int num2 = 20;
        float resultado1 =  (float) num1 / num2;
        float resultado2 =  (float) num1 * num2;
        float resultado3 =  (float) num1 + num2;
        float resultado4 =  (float) num1 - num2;

        float[] resultados = {resultado1, resultado2 , resultado3 ,resultado4};

        for (int i = 0; i<4;i++){
            System.out.println(resultados[i]);
        }

        // % de resto da divisao  par ou inpar

        double resto = 20 % 2;
        System.out.println(resto);
    /*
         logicos
        <menor              >maior
        <= menorigual      >=maior igual
        == comparando
        !=diferente
        Sempre retorna booleano
    */
        boolean resultadoVerificaNumDiferente = (num1 != num2);
        boolean resultadoVerificaNumIgual = (num1 == num2);
        System.out.println(resultadoVerificaNumIgual);
        System.out.println(resultadoVerificaNumDiferente);



        /* Operadores logicos
        && (AND) e
        // (OR) ou
        ! (NOT) Inverte o valor lógico da expressão.
        */

        if (num1 > 5 && num2 < 25) {
            System.out.println("Ambas as condições são verdadeiras!");
        }
        if (num1 > 5 || num2 > 10) {
            System.out.println("Pelo menos uma condição é verdadeira!");
        }
        boolean temSol = true;

        if (!temSol) {
            System.out.println("Está nublado!");
        } else {
            System.out.println("Está ensolarado!");
        }

        /*
        =: Atribuição simples.
        +=: Atribui a soma.
        -=: Atribui a subtração.
        *=: Atribui a multiplicação.
        /=: Atribui a divisão.
        %=: Atribui o resto da divisão.
         */

        int numero = 10;  // Atribuição simples

        System.out.println("Valor inicial de numero: " + numero);  // Imprime: 10
        // Atribuição com soma (+=)
        numero += 5;  // Equivalente a: numero = numero + 5
        System.out.println("Após numero += 5: " + numero);  // Imprime: 15

        // Atribuição com subtração (-=)
        numero -= 3;  // Equivalente a: numero = numero - 3
        System.out.println("Após numero -= 3: " + numero);  // Imprime: 12

        // Atribuição com multiplicação (*=)
        numero *= 2;  // Equivalente a: numero = numero * 2
        System.out.println("Após numero *= 2: " + numero);  // Imprime: 24

        // Atribuição com divisão (/=)
        numero /= 4;  // Equivalente a: numero = numero / 4
        System.out.println("Após numero /= 4: " + numero);  // Imprime: 6

        // Atribuição com módulo (%=)
        numero %= 3;  // Equivalente a: numero = numero % 3
        System.out.println("Após numero %= 3: " + numero);  // Imprime: 0


    }
}
