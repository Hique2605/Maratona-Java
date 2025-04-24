package com.github.hique2605.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {

    public static void main(String[] args) {

        //array de array
        //1,2,3,4,5 Mes
        //31,28,31,30 dias

        int[][] calendario = {
                new int[31], // Janeiro
                new int[28], // Fevereiro
                new int[31], // Março
                new int[30], // Abril
                new int[31], // Maio
                new int[30], // Junho
                new int[31], // Julho
                new int[31], // Agosto
                new int[30], // Setembro
                new int[31], // Outubro
                new int[30], // Novembro
                new int[31]  // Dezembro
        };


        for (int mes = 0; mes < calendario.length; mes++) {
            System.out.print("\nMês " + (mes + 1) + ": ");
            for (int j = 0; j < calendario[mes].length; j++) {
                calendario[mes][j] = j + 1; // preenche os dias de 1 até N
                System.out.print(calendario[mes][j] + " ");


            }
        }

        // Agora imprimindo com for-each
        int numeroMes = 1;
        for (int[] mes : calendario) {
            System.out.print("\nMês " + numeroMes++ + ": ");
            for (int dia : mes) {
                System.out.print(dia + " ");
            }
            System.out.println();
        }

        int [] array = {1,2,3};
        // array teste
        int [][] arrayInt = new int [3][];

        arrayInt[0]= new int[2];
        arrayInt[1]= array;
            //arrayInt[1]= new int[3];como tava antes
        arrayInt[2]= new int[]{1,2,3,4,5,6};
             //arrayInt[2]= new int[6]; como tava antes




        for (int [] arrayBase : arrayInt){
            System.out.println("\n------");
            for (int num : arrayBase){
                System.out.print(num+" ");
            }
        }

        // outra forma
        int[][] arrayInt2 = {{0,0},{2,3,2},{8,5,9,8,8,8}};
        for (int [] arrayBase2 : arrayInt2){
            System.out.println("\n------");
            for (int num : arrayBase2){
                System.out.print(num+" ");
            }
        }

    }
}
