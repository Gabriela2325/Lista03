public class Exercicio10 {
    public static void executar(){

        System.out.println("Exercicio10");

        //10. Faça um programa que receba a idade de um número finito de pessoas e mostre mensageminformando
        // “maior de idade” e “menor de idade” para cada pessoa.
        // Considerar a pessoa com 18anos como maior de idade.

        int pessoas = Prompt.lerInteiro("Digite a quantidade de pessoas: ");

        for (int i = 0; i < pessoas; i++) {
            int idade = Prompt.lerInteiro("Digite a idade da pessoa " + (i + 1) + ": ");

            if (idade >= 18) {
                System.out.println("Pessoa " + (i + 1) + ": Maior de idade");
            } else {
                System.out.println("Pessoa " + (i + 1) + ": Menor de idade");
            }
        }
    }
}
