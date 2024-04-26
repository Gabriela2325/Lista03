package br.edu.up.exercicios;

import br.edu.up.util.*;
import br.edu.up.modelos.Vendedor03;

public class Exercicio03 {
    public static void executar() {
        System.out.println("Exercicio03: ");

        // 3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e
        // o total de vendasefetuadas
        // por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão
        // sobresuas vendas efetuadas,
        // informar o seu nome, o salário fixo e salário no final do mês

        String nome = Prompt.lerLinha("Digite o nome do vendedor: ");
        double salarioFixo = Prompt.lerDecimal("Digite o salário fixo do vendedor: ");
        double totalVendas = Prompt.lerDecimal("Digite o total de vendas efetuadas pelo vendedor no mês: ");

        Vendedor03 vendedor = new Vendedor03(nome, salarioFixo, totalVendas);

        System.out.println(vendedor);
    }
}
