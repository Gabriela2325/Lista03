package br.edu.up.exercicios;

import br.edu.up.util.*;
import br.edu.up.modelos.Aluno01;

public class Exercicio01 {
    public static void executar() {

        System.out.println("Exercicio01: ");

        // 1. Escrever um programa que leia o nome de um aluno e as notas das três
        // provas que ele obteve no semestre.
        // No final informar o nome do aluno e a sua média (aritmética).

        String nomeAluno = Prompt.lerLinha("Digite o nome do aluno: ");

        double nota1 = Prompt.lerDecimal("Digite a nota da 1° prova: ");
        double nota2 = Prompt.lerDecimal("Digite a nota da 2° prova: ");
        double nota3 = Prompt.lerDecimal("Digite a nota da 3° prova: ");

        Aluno01 aluno01 = new Aluno01(nomeAluno, nota1, nota2, nota3);

        System.out.println(aluno01.toString());

    }
}
