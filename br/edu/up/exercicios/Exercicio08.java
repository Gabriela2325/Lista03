package br.edu.up.exercicios;

import br.edu.up.util.*;
import br.edu.up.modelos.Aluno08;

public class Exercicio08 {
    public static void executar() {

        System.out.println("Exercicio08");

        // 8. Escrever um programa que leia o nome e as três notas obtidas por um aluno
        // durante o semestre.
        // Calcular a sua média (aritmética), informar o nome e sua menção aprovado
        // (media >= 7),Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9)

        String nome = Prompt.lerLinha("Digite o nome do aluno: ");
        double nota1 = Prompt.lerDecimal("Digite a primeira nota do aluno: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota do aluno: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota do aluno: ");

        Aluno08 aluno = new Aluno08(nome, nota1, nota2, nota3);

        System.out.println(aluno);

    }
}
