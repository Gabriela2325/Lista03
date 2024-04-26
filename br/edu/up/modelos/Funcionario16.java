package br.edu.up.modelos;

public class Funcionario16 {
    private double salario;
    private double novoSalario;

    public Funcionario16(double salarioParam) {
        salario = salarioParam;
        novoSalario = 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salarioParam) {
        salario = salarioParam;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }

    public void aplicarReajuste(double minimo) {
        if (salario < 3 * minimo) {
            novoSalario = salario * 1.5;
        } else if (salario >= 3 * minimo && salario <= 10 * minimo) {
            novoSalario = salario * 1.2;
        } else if (salario > 10 * minimo && salario <= 20 * minimo) {
            novoSalario = salario * 1.15;
        } else {
            novoSalario = salario * 1.1;
        }
    }

    public String toString() {
        return "Salário: " + salario + "\n"
                + "Novo Salário: " + novoSalario;
    }
}
