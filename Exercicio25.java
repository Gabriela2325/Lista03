public class Exercicio25 {
    public static void executar(){

    System.out.println("Exercicio25");

    //25. Dado o nome de um estudante, com o respectivo número de matrícula e as três notas acimamencionadas, 
    //desenvolva um programa para calcular a nota final e a classificação de cadaestudante.
    // A classificação é dada conforme a lista abaixo:Nota Final Classificação[8,10] A[7,8] B[6,7] C[5,6] D[0,5] 
    //RImprima o nome do estudante, com o seu número, nota final e classificação.


    String nome = Prompt.lerLinha("Digite o nome do estudante: ");
    int matricula = Prompt.lerInteiro("Digite o número de matrícula do estudante: ");
    double notalaboratorio = Prompt.lerDecimal("Digite a nota do trabalho de laboratório (0 a 10): ");
    double notasemestral = Prompt.lerDecimal("Digite a nota da avaliação semestral (0 a 10): ");
    double notaexame = Prompt.lerDecimal("Digite a nota do exame final (0 a 10): ");

    double notafinal = NotaFinal(notalaboratorio, notasemestral, notaexame);

    String classificacao = Classificacao(notafinal);

    System.out.println("Nome do estudante: " + nome);
    System.out.println("Número de matrícula: " + matricula);
    System.out.println("Nota final: " + notafinal);
    System.out.println("Classificação: " + classificacao);
    }

    public static double NotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
    
    double notaFinal = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
        return notaFinal;
    }

    public static String Classificacao(double notaFinal) {
     
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
}