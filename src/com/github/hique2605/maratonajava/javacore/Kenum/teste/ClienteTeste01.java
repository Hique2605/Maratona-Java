package com.github.hique2605.maratonajava.javacore.Kenum.teste;

import com.github.hique2605.maratonajava.javacore.Kenum.entidade.Cliente;
import com.github.hique2605.maratonajava.javacore.Kenum.entidade.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("Carlos" , TipoCliente.PESSOA_JURIDICA);
        Cliente cliente02 = new Cliente("Bola" ,TipoCliente.PESSOA_FISICA );

        //problema de inconsistência de dados

        System.out.println(cliente01);
        System.out.println(cliente02);


    }
}
