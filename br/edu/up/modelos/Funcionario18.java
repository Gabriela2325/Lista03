package br.edu.up.modelos;

public class Funcionario18 {
    private String nome;
    private int idade;
    private String sexo;
    private double salarioFixo;

    public Funcionario18(String nomeParam, int idadeParam, String sexoParam, double salarioFixoParam) {
        nome = nomeParam;
        idade = idadeParam;
        sexo = sexoParam;
        salarioFixo = salarioFixoParam;
    }

    public Funcionario18() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeParam) {
        nome = nomeParam;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idadeParam) {
        idade = idadeParam;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexoParam) {
        sexo = sexoParam;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixoParam) {
        salarioFixo = salarioFixoParam;
    }

    public double calcularAbono() {
        double abono = 0;

        if (sexo.equalsIgnoreCase("M")) {
            if (idade >= 30) {
                abono = 100;
            } else {
                abono = 50;
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            if (idade >= 30) {
                abono = 200;
            } else {
                abono = 80;
            }
        }

        return abono;
    }

    public double calcularSalarioLiquido() {
        double abono = calcularAbono();
        return salarioFixo + abono;
    }

    public String toString() {
        double abono = calcularAbono();
        double salarioLiquido = calcularSalarioLiquido();

        return "Nome do funcionário: " + nome + "\n" +
                "Salário líquido acrescido do abono: " + salarioLiquido;
    }
}