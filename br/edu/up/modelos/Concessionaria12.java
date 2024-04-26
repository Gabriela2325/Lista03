package br.edu.up.modelos;

import br.edu.up.util.*;

public class Concessionaria12 {

    private int totalCarrosAte2000;
    private int totalGeral;

    public Concessionaria12(int nParam) {
        totalCarrosAte2000 = 0;
        totalGeral = 0;
    }

    public Concessionaria12() {
        totalCarrosAte2000 = 0;
        totalGeral = 0;
    }

    public int getTotalCarrosAte2000() {
        return totalCarrosAte2000;
    }

    public void setTotalCarrosAte2000(int nParam) {
        totalCarrosAte2000 = nParam;
    }

    public int getTotalGeral() {
        return totalGeral;
    }

    public void setTotalGeral(int nParam) {
        totalGeral = nParam;
    }

    public String toString() {
        return "Total de carros até 2000: " + totalCarrosAte2000 + "\n" +
                "Total geral de carros calculados: " + totalGeral;
    }

    public void calcularDesconto() {
        while (true) {
            int ano = Prompt.lerInteiro("Digite o ano do veículo: ");
            double valor = Prompt.lerDecimal("Digite o valor do veículo: ");

            double desconto;
            if (ano <= 2000) {
                desconto = valor * 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = valor * 0.07;
            }

            double valorAPagar = valor - desconto;
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a pagar pelo cliente: R$" + valorAPagar);

            totalGeral++;

            String continuar = Prompt.lerLinha("Deseja continuar calculando desconto? S/N: ");
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }
    }
}
