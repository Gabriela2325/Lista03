public class Exercicio10 {
    public static void executar(){

        System.out.println("Exercicio10");

        //10. Faça um programa que receba a idade de um número finito de pessoas e mostre mensageminformando
        // “maior de idade” e “menor de idade” para cada pessoa.
        // Considerar a pessoa com 18anos como maior de idade.

        int quantidade = Prompt.lerInteiro("Digite a quantidade de pessoas: ");

        Pessoa10 pessoas = new Pessoa10(quantidade);

        pessoas.verificarIdades();
    }
}
