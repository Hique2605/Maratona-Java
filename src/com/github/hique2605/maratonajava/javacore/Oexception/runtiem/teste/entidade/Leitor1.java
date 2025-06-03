package com.github.hique2605.maratonajava.javacore.Oexception.runtiem.teste.entidade;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor1");
    }
}
