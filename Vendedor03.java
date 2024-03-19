public class Vendedor03 {
    private String nome;
    private double salario;
    private double vendas;

    public Vendedor03(String nParam, double sParam, double vParam) {
        nome = nParam;
        salario = sParam;
        vendas = vParam;
    }

    public Vendedor03() {
        
    }

    public double calcularComissao() {
        return 0.15 * vendas;
    }

    public double calcularSalarioTotal() {
        return salario + calcularComissao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nParam) {
        nome = nParam;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalarioFixo(double sParam) {
        salario = sParam;
    }

    public double getvendas() {
        return vendas;
    }

    public void setTotalVendas(double vParam) {
        vendas = vParam;
    }

    public String toString() {
        return "Nome do vendedor: " + nome + "\n" +
               "Salário fixo: R$ " + salario + "\n" +
               "Salário no final do mês: R$ " + calcularSalarioTotal();
    }
}
