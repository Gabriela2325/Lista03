public class Estudante24 {
    private double notaLaboratorio;
    private double notaSemestral;
    private double notaExameFinal;

    public Estudante24(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaSemestral = notaSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double getNotaLaboratorio() {
        return notaLaboratorio;
    }

    public void setNotaLaboratorio(double notaLaboratorio) {
        this.notaLaboratorio = notaLaboratorio;
    }

    public double getNotaSemestral() {
        return notaSemestral;
    }

    public void setNotaSemestral(double notaSemestral) {
        this.notaSemestral = notaSemestral;
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

    public static void executar() {
        System.out.println("Exercicio24");

        double notaLaboratorio = Prompt.lerDecimal("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaSemestral = Prompt.lerDecimal("Digite a nota da avaliação semestral (0 a 10): ");
        double notaExameFinal = Prompt.lerDecimal("Digite a nota do exame final (0 a 10): ");

        Estudante24 estudante = new Estudante24(notaLaboratorio, notaSemestral, notaExameFinal);
        double notaFinal = estudante.calcularNotaFinal();

        System.out.println("A nota final do estudante é: " + notaFinal);
    }
}