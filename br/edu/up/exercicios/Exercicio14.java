package br.edu.up.exercicios;

import br.edu.up.modelos.Produto14;
import java.util.List;

public class Exercicio14 {
    public static void executar() {

        System.out.println("Exercicio14");

        // 14. Faça um programa que receba o preço de custo e o preço de venda de 40
        // produtos.
        // Mostrecomo resultado se houve lucro,
        // prejuízo ou empate para cada produto. Informe média de preço decusto e do
        // preço de venda

        List<Produto14> produtos = Produto14.criarProdutos();

        for (Produto14 produto : produtos) {
            double precoCusto = Math.random() * 100;
            double precoVenda = precoCusto + (Math.random() * 50);
            produto.setPrecoCusto(precoCusto);
            produto.setPrecoVenda(precoVenda);
        }

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("Produto " + (i + 1) + ":");
            System.out.println(produtos.get(i));
            System.out.println("-----------------------------");
        }
    }
}
