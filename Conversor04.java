public class Conversor04 {
    private double cotacao;
    private double quantidade;

    public Conversor04(double cParam, double qParam) {
        cotacao = cParam;
        quantidade = qParam;
    }

    public Conversor04() {
        
    }

    public double valorReal() {
        return cotacao * quantidade;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cParam) {
        cotacao = cParam;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double qParam) {
        cotacao = qParam;
    }

    public String toString() {
        return "Cotação do dólar: R$ " + cotacao + "\n" +
               "Quantidade de dólares: " + quantidade + "\n" +
               "Valor em reais: R$ " + valorReal();
    }
}