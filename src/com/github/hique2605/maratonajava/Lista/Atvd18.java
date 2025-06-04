package Lista;

public class Atvd18 {
    public static void main(String[] args) {

        //18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
        // Faça um algoritmo que calcule e
        // imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.



        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int anos = 0;

        while (alturaSara <= alturaFrancisco) {
            alturaFrancisco += 0.02; // 2 cm = 0.02 m
            alturaSara += 0.03;      // 3 cm = 0.03 m
            anos++;
        }

        System.out.println("Sara será maior que Francisco em " + anos + " anos.");
    }


    }

