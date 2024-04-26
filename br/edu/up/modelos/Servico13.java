package br.edu.up.modelos;

import br.edu.up.util.*;

public class Servico13 {
    private int totalPessoasAptas;
    private int totalPessoasInaptas;

    public Servico13(int totalAptas, int totalInaptas) {
        totalPessoasAptas = totalAptas;
        totalPessoasInaptas = totalInaptas;
    }

    public Servico13() {
        totalPessoasAptas = 0;
        totalPessoasInaptas = 0;
    }

    public int getTotalPessoasAptas() {
        return totalPessoasAptas;
    }

    public void setTotalPessoasAptas(int totalAptas) {
        totalPessoasAptas = totalAptas;
    }

    public int getTotalPessoasInaptas() {
        return totalPessoasInaptas;
    }

    public void setTotalPessoasInaptas(int totalInaptas) {
        totalPessoasInaptas = totalInaptas;
    }

    public String toString() {
        return "Total de pessoas aptas: " + totalPessoasAptas + "\n" +
                "Total de pessoas inaptas: " + totalPessoasInaptas;
    }

    public void verificarAptidao() {
        int pessoas = Prompt.lerInteiro("Digite o número de pessoas: ");

        for (int i = 0; i < pessoas; i++) {
            String nome = Prompt.lerLinha("Digite o nome da pessoa " + (i + 1) + ": ");
            String sexo;

            do {
                sexo = Prompt.lerLinha("Digite o sexo da pessoa (M para masculino, F para feminino): ");
                sexo = sexo.toUpperCase();
            } while (!sexo.equals("M") && !sexo.equals("F"));

            int idade = Prompt.lerInteiro("Digite a idade da pessoa: ");
            String saude = Prompt.lerLinha("Digite a saúde da pessoa (Boa ou Ruim): ");

            boolean apto = (sexo.equals("M") && idade >= 18 && saude.equalsIgnoreCase("Boa"));

            if (apto) {
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
                totalPessoasAptas++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar obrigatório.");
                totalPessoasInaptas++;
            }
        }
    }
}