public class Automovel02 {
    private double distancia;
    private double combustivel;

    public Automovel02(double dParam, double cParam) {
        distancia = dParam;
        combustivel = cParam;
    }

    public Automovel02() {
    
    }

    public double ConsumoMedio() {
        return distancia / combustivel;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double dParam) {
        distancia = dParam;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double cParam) {
        combustivel = cParam;
    }

    public String toString() {
        return "Distância percorrida: " + distancia + "\n"
                + "Combustível consumido: " + combustivel + "\n"
                + "Consumo médio: " + ConsumoMedio();
    }
}