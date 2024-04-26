package br.edu.up.exercicios;

import br.edu.up.util.*;
import br.edu.up.modelos.Funcionario18;

public class Exercicio18 {
    public static void executar() {

        System.out.println("Exercicio18");

        // 18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um
        // funcionário.
        // Mostreo nome e o salário líquido acrescido do abono conforme o sexo e a
        // idade:

        String nome = Prompt.lerLinha("Digite o nome do funcionário: ");
        int idade = Prompt.lerInteiro("Digite a idade do funcionário: ");
        String sexo = Prompt.lerLinha("Digite o sexo do funcionário (M para masculino, F para feminino): ");
        double salarioFixo = Prompt.lerDecimal("Digite o salário fixo do funcionário: ");

        Funcionario18 funcionario = new Funcionario18(nome, idade, sexo, salarioFixo);

        System.out.println(funcionario.toString());
    }
}