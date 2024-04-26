package br.edu.up.exercicios;

import br.edu.up.util.*;
import br.edu.up.modelos.Funcionario17;

public class Exercicio17 {
    public static void executar() {

        System.out.println("Exercicio17");

        // 17. Leia o nome do funcionário, seu salário e o valor do salário mínimo.
        // Calcule o seu novo salárioreajustado. Escrever o nome do funcionário, o
        // reajuste e seu novo salário.
        // Calcule quanto àempresa vai aumentar sua folha de pagamento.

        String nomeFuncionario = Prompt.lerLinha("Digite o nome do funcionário: ");

        double salarioFuncionario = Prompt.lerDecimal("Digite o salário do funcionário: ");
        while (salarioFuncionario < 0) {
            System.out.println("Salário não pode ser negativo.");
            salarioFuncionario = Prompt.lerDecimal("Digite o salário do funcionário: ");
        }

        double salarioMinimo = Prompt.lerDecimal("Digite o valor do salário mínimo: ");
        while (salarioMinimo < 0) {
            System.out.println("Valor do salário mínimo não pode ser negativo.");
            salarioMinimo = Prompt.lerDecimal("Digite o valor do salário mínimo: ");
        }

        Funcionario17 funcionario = new Funcionario17(nomeFuncionario, salarioFuncionario, salarioMinimo);
        funcionario.calcularSalarioNovo();

        System.out.println(funcionario.toString());

    }
}