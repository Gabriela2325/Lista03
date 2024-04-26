package br.edu.up.modelos;

public class Compra05 {
    private String nomeP;
    private double precoP;
    private int quantidade;

    public Compra05(String nParam, double pParam, int qParam) {
        nomeP = nParam;
        precoP = pParam;
        quantidade = qParam;
    }

    public Compra05() {

    }

    public double calcularVT() {
        return precoP * quantidade;
    }

    public String getNomeProduto() {
        return nomeP;
    }

    public void setNomeProduto(String pParam) {
        nomeP = pParam;
    }

    public double getPrecoProduto() {
        return precoP;
    }

    public void setPrecoProduto(double pParam) {
        precoP = pParam;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int qParam) {
        quantidade = qParam;
    }

    public String toString() {
        return "Nome do produto: " + nomeP + "\n" +
                "Preço do produto: R$ " + precoP + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "Valor total da compra: R$ " + calcularVT();
    }
}
