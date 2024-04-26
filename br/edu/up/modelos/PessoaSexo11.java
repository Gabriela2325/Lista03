package br.edu.up.modelos;

import br.edu.up.util.*;

public class PessoaSexo11 {
    private int totalHomens;
    private int totalMulheres;

    public PessoaSexo11(int nParam) {
        totalHomens = 0;
        totalMulheres = 0;
    }

    public PessoaSexo11() {
        totalHomens = 0;
        totalMulheres = 0;
    }

    public int getTotalHomens() {
        return totalHomens;
    }

    public void setTotalHomens(int nParam) {
        totalHomens = nParam;
    }

    public int getTotalMulheres() {
        return totalMulheres;
    }

    public void setTotalMulheres(int nParam) {
        totalMulheres = nParam;
    }

    public String toString() {
        return "Total de homens: " + totalHomens + "\n" +
                "Total de mulheres: " + totalMulheres;
    }

    public void lerPessoas() {
        System.out.println("Digite o nome e o sexo de cada pessoa:");

        for (int i = 0; i < 56; i++) {
            String nome = Prompt.lerLinha("Digite o nome da pessoa " + (i + 1) + ": ");
            String sexo;

            do {
                sexo = Prompt.lerLinha("Digite o sexo da pessoa (H para homem, M para mulher): ");
                sexo = sexo.toUpperCase();
            } while (!sexo.equals("H") && !sexo.equals("M"));

            if (sexo.equals("H")) {
                System.out.println(nome + " - Homem");
                totalHomens++;
            } else if (sexo.equals("M")) {
                System.out.println(nome + " - Mulher");
                totalMulheres++;
            }
        }
    }
}