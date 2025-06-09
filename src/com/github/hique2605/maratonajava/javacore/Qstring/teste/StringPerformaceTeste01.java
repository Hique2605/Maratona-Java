package com.github.hique2605.maratonajava.javacore.Qstring.teste;

public class StringPerformaceTeste01 {
    public static void main(String[] args) {

        Long inicio1 = System.currentTimeMillis();
        concatenaString(30000);
        Long fim1 = System.currentTimeMillis();
        System.out.println("Tempo gasto com String: " + (fim1 - inicio1) + "ms");


        Long inicio2 = System.currentTimeMillis();
        concatenaStringBuilder(1_000_000);
        Long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto com String Builder : " + (fim2 - inicio2) + "ms");

        Long inicio3 = System.currentTimeMillis();
        concatenaStringBuffer(1_000_000);
        Long fim3 = System.currentTimeMillis();
        System.out.println("Tempo gasto com String Buffer: " + (fim3 - inicio3) + "ms");



    }

    private static void concatenaString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
        //mt mais rapido que String
    private static void concatenaStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatenaStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }


}
