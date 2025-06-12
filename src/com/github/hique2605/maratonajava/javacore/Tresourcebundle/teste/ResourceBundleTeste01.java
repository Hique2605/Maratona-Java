package com.github.hique2605.maratonajava.javacore.Tresourcebundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;


public class ResourceBundleTeste01 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        boolean teste = bundle.containsKey("asddasd");
        System.out.println(teste);


        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("mundo"));
        System.out.println(bundle.getString("bem.vindo"));

        System.out.println("---------------------------------");

        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        System.out.println(bundle1.getString("ola"));
        System.out.println(bundle1.getString("mundo"));
        System.out.println(bundle1.getString("bem.vindo"));


    }
}
