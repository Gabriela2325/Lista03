public class Veiculo15 {
    private String tipoCombustivel;
    private double valorVeiculo;

    public Veiculo15(String tipoCombustivel, double valorVeiculo) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorVeiculo = valorVeiculo;
    }

    public Veiculo15() {
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
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