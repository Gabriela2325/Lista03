package br.edu.up.exercicios;

import br.edu.up.util.*;
import br.edu.up.modelos.Carro07;

public class Exercicio07 {
    public static void executar() {

        System.out.println("Exercicio07");

        // 7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
        // percentagem do distribuidor
        // e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e
        // depois apercentagem do distribuidor
        // sobre o resultado). Supondo que a percentagem do distribuidor sejade 28% e os
        // impostos 45%.
        // Escrever um programa que leia o custo de fábrica de um carro e informeo custo
        // ao consumidor do mesmo.

        double custoFabrica = Prompt.lerDecimal("Digite o custo de fábrica do carro: ");
        double percentagemDistribuidor = 0.28;
        double impostos = 0.45;

        Carro07 carro = new Carro07(custoFabrica, percentagemDistribuidor, impostos);
        double custoConsumidor = carro.calcularCustoConsumidor();

        System.out.println("O custo ao consumidor do carro é de: R$ " + custoConsumidor);
    }
}
