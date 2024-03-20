public class Exercicio23 {
    public static void executar(){

    System.out.println("Exercicio23");

    // 23. Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. 
    //Calcule e mostrenome e o seu peso ideal de acordo com as seguintes características da pessoa:

    String nome = Prompt.lerLinha("Digite o nome da pessoa: ");
    String sexo = Prompt.lerLinha("Digite o sexo da pessoa (M para masculino, F para feminino): ");
    double altura = Prompt.lerDecimal("Digite a altura da pessoa em metros: ");
    int idade = Prompt.lerInteiro("Digite a idade da pessoa: ");

    Pessoa23 pessoa = new Pessoa23(nome, sexo, altura, idade);
    System.out.println(pessoa);

    }
}   
