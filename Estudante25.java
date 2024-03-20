public class Estudante25 {
    private String nome;
    private int matricula;
    private double notaLaboratorio;
    private double notaSemestral;
    private double notaExameFinal;

    public Estudante25(String nomeParam, int matriculaParam, double notaLaboratorioParam, double notaSemestralParam, double notaExameFinalParam) {
        nome = nomeParam;
        matricula = matriculaParam;
        notaLaboratorio = notaLaboratorioParam;
        notaSemestral = notaSemestralParam;
        notaExameFinal = notaExameFinalParam;
    }

    public Estudante25() {
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeParam) {
        nome = nomeParam;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matriculaParam) {
        matricula = matriculaParam;
    }

    public double getNotaLaboratorio() {
        return notaLaboratorio;
    }

    public void setNotaLaboratorio(double notaLaboratorioParam) {
        notaLaboratorio = notaLaboratorioParam;
    }

    public double getNotaSemestral() {
        return notaSemestral;
    }

    public void setNotaSemestral(double notaSemestralParam) {
        notaSemestral = notaSemestralParam;
    }

    public double getNotaExameFinal() {
        return notaExameFinal;
    }

    public void setNotaExameFinal(double notaExameFinal) {
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularNotaFinal() {
        return (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
    }

    public String determinarClassificacao() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 8 && notaFinal <= 10) {
            return "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return "D";
        } else {
            return "R";
        }
    }

    public String toString() {
        double notaFinal = calcularNotaFinal();
        String classificacao = determinarClassificacao();

        return "Nome do estudante: " + nome + "\n" +
               "Número de matrícula: " + matricula + "\n" +
               "Nota do trabalho de laboratório: " + notaLaboratorio + "\n" +
               "Nota da avaliação semestral: " + notaSemestral + "\n" +
               "Nota do exame final: " + notaExameFinal + "\n" +
               "Nota final: " + notaFinal + "\n" +
               "Classificação: " + classificacao;
    }
}