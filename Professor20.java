public class Professor20 {
    private int horasTrabalhadas;
    private int nivel;

    public Professor20(int horasTrabalhadas, int nivel) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.nivel = nivel;
    }

    public Professor20() {
       
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadasParam) {
        horasTrabalhadas = horasTrabalhadasParam;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivelParam) {
        nivel = nivelParam;
    }

    public double calcularSalario() {
        double salario;
        switch (nivel) {
            case 1:
                salario = horasTrabalhadas * 12.00;
                break;
            case 2:
                salario = horasTrabalhadas * 17.00;
                break;
            case 3:
                salario = horasTrabalhadas * 25.00;
                break;
            default:
                throw new IllegalArgumentException("Nível de professor inválido.");
        }
        return salario;
    }
    
    public String toString() {
        return "Horas trabalhadas: " + horasTrabalhadas + "\n" +
                "Nível: " + nivel + "\n" +
                "Salário: R$" + calcularSalario();
    }
}
