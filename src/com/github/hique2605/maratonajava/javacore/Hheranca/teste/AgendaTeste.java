package com.github.hique2605.maratonajava.javacore.Hheranca.teste;

import com.github.hique2605.maratonajava.javacore.Hheranca.entidade.Contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contato> contatos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\nAGENDA DE CONTATOS");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar por nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir \n

            switch (opcao) {
                case 1:
                    // Cadastro
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    contatos.add(new Contato(nome, telefone, email));
                    break;

                case 2:
                    // Listagem
                    for (Contato c : contatos) {
                        System.out.println("Nome: " + c.getNome() +
                                " | Telefone: " + c.getTelefone() +
                                " | Email: " + c.getEmail());
                    }
                    break;

                case 3:
                    // Busca por nome
                    System.out.print("Digite o nome a buscar: ");
                    String busca = scanner.nextLine().toLowerCase();
                    boolean encontrado = false;

                    for (Contato c : contatos) {
                        if (c.getNome().toLowerCase().contains(busca)) {
                            System.out.println("Nome: " + c.getNome() +
                                    " | Telefone: " + c.getTelefone() +
                                    " | Email: " + c.getEmail());
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();

    }
}
