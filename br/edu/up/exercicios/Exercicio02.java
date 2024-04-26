package br.edu.up.exercicios;

import br.edu.up.util.*;
import br.edu.up.modelos.Automovel02;

public class Exercicio02 {
    public static void executar() {
        System.out.println("Exercicio02: ");

        // 2. Escrever um programa para determinar o consumo médio de um automóvel sendo
        // fornecida
        // adistância total percorrida pelo automóvel e o total de combustível gasto.

        double distancia = Prompt.lerDecimal("Digite a distância total percorrida (em km): ");
        double combustivel = Prompt.lerDecimal("Digite o total de combustível gasto (em litros): ");

        Automovel02 automovel = new Automovel02(distancia, combustivel);

        System.out.println("O consumo médio do automóvel é de: " + automovel.ConsumoMedio() + " km/l");
    }

}
