public class Carro07 {
    private double custoFabrica;
    private double percentagemDistribuidor;
    private double impostos;

    public Carro07(double pParam, double pdParam, double iParam) {
        custoFabrica = pParam;
        percentagemDistribuidor = pdParam;
        impostos = iParam;
    }

    public Carro07(){

    }

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double pParam) {
        custoFabrica = pParam;
    }

    public double getPercentagemDistribuidor() {
        return percentagemDistribuidor;
    }

    public void setPercentagemDistribuidor(double pdParam) {
        percentagemDistribuidor = pdParam;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double iParam) {
        impostos = iParam;
    }

    public double calcularCustoConsumidor() {
        double valorImpostos = impostos * custoFabrica;
        double custoIntermediario = custoFabrica + valorImpostos;
        double valorDistribuidor = percentagemDistribuidor * custoIntermediario;
        return custoIntermediario + valorDistribuidor;
    }

    public String toString() {
        return "Custo de fábrica do carro: R$ " + custoFabrica + "\n"
                + "Porcentagem do distribuidor: " + percentagemDistribuidor * 100 + "%\n"
                + "Impostos: " + impostos * 100 + "%\n"
                + "Custo ao consumidor: R$ " + calcularCustoConsumidor();
    }
}
