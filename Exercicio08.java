public class Exercicio08 {
    public static void executar(){

        System.out.println("Exercicio08");

        //8. Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre.
        //Calcular a sua média (aritmética), informar o nome e sua menção aprovado
        //(media >= 7),Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9)

        String nome = Prompt.lerLinha("Digite o nome do aluno: ");

        double nota1 = Prompt.lerDecimal("Digite a primeira nota do aluno: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota do aluno: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota do aluno: ");

        double media = (nota1 + nota2 + nota3) / 3;

        String mencao;
        if (media >= 7) {
            mencao = "Aprovado";
        } else if (media <= 5) {
            mencao = "Reprovado";
        } else {
            mencao = "Recuperação";
        }

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Menção: " + mencao);

    }
}
