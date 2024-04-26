package br.edu.up.exercicios;

import br.edu.up.util.*;
import br.edu.up.modelos.Pretendente26;

public class Exercicio26 {
    public static void executar() {

        System.out.println("Exercicio26");

        // 6. Uma seguradora possui nove categorias de seguro baseadas na idade e
        // ocupação do segurado.
        // Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir
        // apólices deseguro.
        // Quanto às classes de ocupações, foram definidos três grupos de risco: baixo,
        // médio e alto.
        // A tabela abaixo fornece as categorias em função da faixa etária e do grupo de
        // risco.
        // Dados nome,idade e grupo de risco de um pretendente, determinar e imprimir
        // seus dados e categoria.
        // Caso aidade não esteja na faixa necessária,
        // imprimir uma mensagem informando que ele não se enquadraem nenhuma das
        // categorias ofertadas

        String nome = Prompt.lerLinha("Digite o nome do pretendente: ");
        int idade = Prompt.lerInteiro("Digite a idade do pretendente: ");
        String grupoRisco = Prompt.lerLinha("Digite o grupo de risco do pretendente (baixo, médio ou alto): ");

        Pretendente26 pretendente = new Pretendente26(nome, idade, grupoRisco);

        System.out.println(pretendente);
    }
}