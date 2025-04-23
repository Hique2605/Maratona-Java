package com.github.hique2605.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {


        //jeito antigo
        int idade01 = 14;
        int idade02 = 15;
        int idade03 = 16;
        //System.out.println(idade01);
        //System.out.println(idade02);
        //System.out.println(idade03);

        //  int[] idades = null;  print null
        int[] idades = new int[3]; // print endereco
        idades[0] = 21;
        idades[1] = 22;
        idades[2] = 32;

        System.out.println(idades[2]);


         String[] nomes = new String[3];
         nomes[0]="Hique";
         nomes[1]="Alemao";
         nomes[2]="Jorge";

         for(int i = 0 ; i < nomes.length; i++){
             System.out.println(nomes[i]);
         }



        int[] arrayNumeros = new int[3];
        int[] arrayNumeros2 = {1,2,3,4,5};

        for(int num : arrayNumeros2){
            System.out.println(num);
        }







    }
}
