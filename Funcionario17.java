public class Funcionario17 {
    
    private String nome;
    private double salario;
    private double salarioMinimo;
    
    public Funcionario17(String nomeParam, double salarioParam, double salarioMinimoParam) {
        nome = nomeParam;
        salario = salarioParam;
        salarioMinimo = salarioMinimoParam;
    }
    
    public Funcionario17() {
            
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nomeParam) {
        nome = nomeParam;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salarioParam) {
        salario = salarioParam;
    }
    
    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimoParam) {
        salarioMinimo = salarioMinimoParam;
    }
    
    public double calcularSalarioNovo() {
        if (salario < 3 * salarioMinimo) {
            return salario * 1.5;
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            return salario * 1.2;
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            return salario * 1.15;
        } else {
            return salario * 1.1;
        }
    }
    
    public String toString() {
        double novoSalario = calcularSalarioNovo();
        double aumentoFolha = novoSalario - salario;
            
        return "Nome do funcionário: " + nome + "\n" +
                "Reajuste: " + (novoSalario - salario) + "\n" +
                "Novo salário: " + novoSalario + "\n" +
                "Aumento na folha de pagamento da empresa: " + aumentoFolha;
    }
}

