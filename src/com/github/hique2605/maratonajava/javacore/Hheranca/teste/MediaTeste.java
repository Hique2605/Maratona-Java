package com.github.hique2605.maratonajava.javacore.Hheranca.teste;


import com.github.hique2605.maratonajava.javacore.Hheranca.entidade.Estudante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudante> listaDeAlunos = new ArrayList<>();

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            Estudante aluno = new Estudante(nome);

            System.out.print("Quantas notas deseja inserir para " + nome + "? ");
            int quantidadeNotas = scanner.nextInt();

            for (int j = 0; j < quantidadeNotas; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                int nota = scanner.nextInt();
                aluno.adicionarNota(nota);
            }

            scanner.nextLine(); // Consumir quebra de linha
            listaDeAlunos.add(aluno);
        }


        System.out.println("\n--- Resultados ---");
        for (Estudante aluno : listaDeAlunos) {
            System.out.println("Aluno: " + aluno.getNome() + " | Média: " + aluno.calcularMedia());
        }

        scanner.close();
    }
}
