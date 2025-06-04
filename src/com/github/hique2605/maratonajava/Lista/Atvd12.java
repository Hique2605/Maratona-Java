package Lista;

import java.util.Scanner;

public class Atvd12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            /*
        12 - Faça um algoritmo que leia o valor de um produto e determine
        o valor que deve ser pago, conforme a escolha da forma de pagamento
        pelo comprador e imprima na tela o valor final do produto a ser pago.
        Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
        Tabela de Código de Condições de Pagamento
        1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

        2 - À Vista no cartão de crédito, recebe 10% de desconto

        3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

        4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
            */

        System.out.println("Digite o nome do produto: ");
        String nomeproduto = sc.nextLine();

        System.out.println("Digite o preco do produto: ");
        double precoProduto = sc.nextDouble();


        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int formaPagamento = sc.nextInt();

        while (formaPagamento < 1 || formaPagamento > 4) {
            System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
            formaPagamento = sc.nextInt();
        }


        switch (formaPagamento) {
            case 1:
                double precoComDesconto1 = precoProduto * 0.85; // 15% de desconto
                 System.out.println("O valor final do produto " + nomeproduto + " é: R$" + precoComDesconto1);
                break;
            case 2:
                double precoComDesconto2 = precoProduto * 0.90; // 10% de desconto
                System.out.println("O valor final do produto " + nomeproduto + " é: R$" + precoComDesconto2);
                break;
            case 3:
                System.out.println("O valor final do produto " + nomeproduto + " é de 2 vezes de : R$" + precoProduto/2);
                break;
            case 4:
                double precoComJuros = precoProduto * 1.10; // 10% de juros
                 System.out.println("O valor final do produto " + nomeproduto + " é: R$" + precoComJuros);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }






        sc.close();
    }
}
