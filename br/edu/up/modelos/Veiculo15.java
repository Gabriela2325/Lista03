package br.edu.up.modelos;

public class Veiculo15 {
    private String tipoCombustivel;
    private double valorVeiculo;

    public Veiculo15(String tipoCombustivelParam, double valorVeiculoParam) {
        tipoCombustivel = tipoCombustivelParam;
        valorVeiculo = valorVeiculoParam;
    }

    public Veiculo15() {
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivelParam) {
        tipoCombustivel = tipoCombustivelParam;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(double valorVeiculoParam) {
        valorVeiculo = valorVeiculoParam;
    }

    public double calcularDesconto() {
        double desconto = 0;
        if (tipoCombustivel.equalsIgnoreCase("álcool")) {
            desconto = valorVeiculo * 0.25;
        } else if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
            desconto = valorVeiculo * 0.21;
        } else if (tipoCombustivel.equalsIgnoreCase("diesel")) {
            desconto = valorVeiculo * 0.14;
        }
        return desconto;
    }

    public double calcularValorAPagar() {
        double desconto = calcularDesconto();
        return valorVeiculo - desconto;
    }

    public String toString() {
        return "Tipo de combustível: " + tipoCombustivel + "\n" +
                "Valor do veículo: " + valorVeiculo;
    }
}