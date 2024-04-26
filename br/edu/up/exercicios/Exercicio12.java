package br.edu.up.exercicios;

import br.edu.up.modelos.Concessionaria12;

public class Exercicio12 {
    public static void executar() {

        System.out.println("Exercicio12");

        // 12. A concessionária de veículos “CARANGO VELHO” está vendendo os seus
        // veículos comdesconto.
        // Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago
        // pelocliente de vários carros.
        // O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000- 12%
        // e acima de 2000 - 7%.
        // O sistema deverá perguntar se deseja continuar calculando descontoaté que a
        // resposta seja:
        // “(N) Não”. Informar total de carros com ano até 2000 e total geral.

        Concessionaria12 concessionaria = new Concessionaria12();
        concessionaria.calcularDesconto();

        System.out.println(concessionaria);
    }
}
