public class Produto06 {
    private double precoCusto;

    public Produto06(double pParam) {
        precoCusto = pParam;
    }

    public Produto06() {
        
    }

    public double calcularPrecoVenda(double acrescimoP) {
        return precoCusto * (1 + acrescimoP / 100);
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double pParam) {
        precoCusto = pParam;
    }

    public String toString() {
        return "Preço de Custo do Produto: R$ " + precoCusto;
    }
}
