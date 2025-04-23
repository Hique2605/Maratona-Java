package com.github.hique2605.maratonajava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {

        /*
        SAO TIPOS GUARDAR EM MEMORIA VALORES SIMPLES, PALAVRAS RESERVADAS, ESCRITO EM MINUSCULA

        TIPO    TAM         V.PADRAO    DESCRICAO
        byte	8 bits	    0	        Número inteiro pequeno (-128 a 127)
        short	16 bits	    0	        Número inteiro maior que byte
        int	    32 bits	    0	        Número inteiro padrão
        long	64 bits	    0L	        Número inteiro grande
        float	32 bits	    0.0f	    Número decimal com menos precisão
        double	64 bits	    0.0d	    Número decimal com mais precisão
        char	16 bits 	'\u0000'	Representa um caractere Unicode
        boolean	1 bit	    false	    Representa verdadeiro ou falso
        */

        //casting
        //forcar ele entrar (--)
        int idadeMinha = (int) 100000000000L;
        //int idadeMinha = 19;
        char sexo = 'M';
        double peso = 68.5;
        float salario = 1000.5f;
        boolean verdadeiro = true;
        //boolean falso = false;
        char caractere = 87;

        System.out.println("Idade: " + idadeMinha
                +",sexo: " +sexo
                +",peso: " +peso
                +",salario: " +salario
                +",boolean: " +verdadeiro
                +",caractere 87: " +caractere);
                //tabela ascii ou da de trabalhar com unicode, ver tabela dai

            //Não é primitivo
            String nome = "Henrique";
            System.out.println(nome);

    }

}
