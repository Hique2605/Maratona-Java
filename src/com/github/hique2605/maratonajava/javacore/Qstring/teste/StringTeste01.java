package com.github.hique2605.maratonajava.javacore.Qstring.teste;

public class StringTeste01 {
        public static void main(String[] args) {

            //String sao imutaveis, ou seja, uma vez criadas, nao podem ser alteradas

            String nome = "Hique";
            String nome2 = "Hique";



            nome.concat(" Oliveira"); // Isso nao altera o conteudo da variavel nome, apenas cria um novo objeto String na memoria

            System.out.println(nome);//imprime hique só

            System.out.println(nome == nome2); // true, porque ambas as variaveis apontam para o mesmo objeto na memoria

            System.out.println("-----------------------");

            nome = nome.concat(" Oliveira"); // Isso nao altera o conteudo da variavel nome, apenas cria um novo objeto String na memoria

            System.out.println(nome);//imprime hique Oliveira

            System.out.println(nome == nome2); // false

            System.out.println("-----------------------");

            String nome3 = new String("Hique");
            System.out.println(nome2 == nome3);
            //da false, porque nome2 e nome3 apontam para objetos diferentes na memoria
            // mesmo que o conteudo seja o mesmo, por causa do uso do operador new,
            System.out.println(nome2 == nome3.intern());
            // da true, porque o metodo intern() retorna uma referencia para o objeto String na pool
            // de strings, que é o mesmo objeto que nome2 aponta


        }
}
