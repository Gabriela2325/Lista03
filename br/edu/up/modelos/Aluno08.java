package br.edu.up.modelos;

public class Aluno08 {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno08(String nParam, double n1Param, double n2Param, double n3Param) {
        nome = nParam;
        nota1 = n1Param;
        nota2 = n2Param;
        nota3 = n3Param;
    }

    public Aluno08() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nParam) {
        nome = nParam;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double n1Param) {
        nota1 = n1Param;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double n2Param) {
        nota2 = n2Param;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double n3Param) {
        nota3 = n3Param;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String calcularMencao() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado";
        } else if (media <= 5) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }

    public String toString() {
        return "Nome do aluno: " + nome + "\n" +
                "Menção: " + calcularMencao();
    }
}
