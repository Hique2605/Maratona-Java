package com.github.hique2605.maratonajava.javacore.Eblocosinicializacao.entidade;

public class Anime {
    private String nome;
    private int[] episodios;


    {
        //É usado às vezes em projetos Java mais antigos
        // //ou em códigos que precisam configurar coisas assim que a classe carregar (ex.: carregar uma configuração, inicializar um driver, etc.).
        System.out.println("BLOCO DE INICIALIZACAO ");


    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int ep : this.episodios) {
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

