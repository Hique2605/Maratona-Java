package com.github.hique2605.maratonajava.introducao;

public class Aula05EstruturasCondicionais {

    public static void main(String[] args) {

        //if else normal
        int idade = 12;
        if (idade >= 18) {
            System.out.println("Maior de Idade");
        } else if (idade < 10) {
            System.out.println("Idade invalida");
        } else {
            System.out.println("Juvenil");
        }


        float salario = 2000;

        String mesagemDoar = "Doar 500";
        String mesagemNaoDoar = "Doar nada ";
        //operador ternario
        //String resultado = (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mesagemDoar : mesagemNaoDoar;

        System.out.println(resultado);

        char sexo = 'M';

        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opcao invalida");
        }


    }

}

