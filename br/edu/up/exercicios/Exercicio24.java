package br.edu.up.exercicios;

import br.edu.up.util.*;
import br.edu.up.modelos.Estudante24;

public class Exercicio24 {
    public static void executar() {

        System.out.println("Exercicio24");

        // 24. Em um curso de Ciência da Computação a nota do estudante é calculada a
        // partir de três notasatribuídas,
        // respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a
        // um examefinal.
        // As notas variam, de 0 a 10 e a nota final é a média ponderada das três notas
        // mencionadas.
        // A lista abaixo fornece os pesos:a. Laboratório: peso 2b. Avaliação semestral:
        // peso 3c. Exame final: peso 5

        double notaLaboratorio = Prompt.lerDecimal("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaSemestral = Prompt.lerDecimal("Digite a nota da avaliação semestral (0 a 10): ");
        double notaExameFinal = Prompt.lerDecimal("Digite a nota do exame final (0 a 10): ");

        Estudante24 estudante = new Estudante24(notaLaboratorio, notaSemestral, notaExameFinal);
        double notaFinal = estudante.calcularNotaFinal();
        System.out.println("A nota final do estudante é: " + notaFinal);

    }
}