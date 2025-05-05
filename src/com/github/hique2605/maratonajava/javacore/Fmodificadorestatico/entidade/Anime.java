package com.github.hique2605.maratonajava.javacore.Fmodificadorestatico.entidade;

public class Anime {
    private String nome;
    private static int[] episodios;

    //0 - Bloco de inicializao é executado quando a jvm carrega classe
    //1 - alocando espaco em memoria pro objeto
    //2 - cada atributo de classe é criado e inicializado com valores default ou
    //3 - bloco de inicializacao é executado
    //4 construtor é executado

    static {
        //É usado às vezes em projetos Java mais antigos
        // //ou em códigos que precisam configurar coisas assim que a classe carregar (ex.: carregar uma configuração, inicializar um driver, etc.).
        System.out.println("DENTRO DO BLOCO DE INICIALIZACAO , estatico, é executado só uma vez ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

    }

    static {
        System.out.println("ordem 2 ");
    }
    static {
        System.out.println("ordem 3 ");
    }

    {
        System.out.println("nao estatico ordem  4 ");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int ep : Anime.episodios) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }


    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

