public class Cliente22 {
    private int tipoCliente;
    private double consumoEnergia;

    public Cliente22(int tipoCliente, double consumoEnergia) {
        this.tipoCliente = tipoCliente;
        this.consumoEnergia = consumoEnergia;
    }

    public Cliente22() {

    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoClienteParam) {
        tipoCliente = tipoClienteParam;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergiaParam) {
        consumoEnergia = consumoEnergiaParam;
    }

    public double calcularValorConta() {
        double valorKWh = calcularValorKWh();
        return consumoEnergia * valorKWh;
    }

    private double calcularValorKWh() {
        switch (tipoCliente) {
            case 1:
                return 0.602;
            case 2:
                return 0.483;
            case 3:
                return 1.29;
            default:
                System.out.println("Tipo de cliente inválido. Usando valor padrão para residência.");
                return 0.602;
        }
    }

    public String toString() {
        return "Tipo de cliente: " + tipoCliente + "\n" +
               "Consumo de energia: " + consumoEnergia;
    }
}