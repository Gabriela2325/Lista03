package br.edu.up.exercicios;

import br.edu.up.modelos.Numeros09;

public class Exercicio09 {
    public static void executar() {

        System.out.println("Exercicio09");

        // 9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo
        // entre
        // 10 (inclusive)e 150 (inclusive)

        Numeros09 numeros = new Numeros09();
        numeros.lerNumeros();

        System.out.println(numeros);

    }
}
