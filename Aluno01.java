public class Aluno01 {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno01(String nParam, double n1Param, double n2Param, double n3Param) {
        nome = nParam;
        nota1 = n1Param;
        nota2 = n2Param;
        nota3 = n3Param;
    }

    public Aluno01(){

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

    public String toString() {
        return "Nome do aluno: " + nome + "\n"
                + "Nota 1: " + nota1 + "\n"
                + "Nota 2: " + nota2 + "\n"
                + "Nota 3: " + nota3 + "\n"
                + "Média: " + calcularMedia();

    }
}