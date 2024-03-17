public class Exercicio18 {
    public static void executar(){

    System.out.println("Exercicio18");

    //18. Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. 
    //Mostreo nome e o salário líquido acrescido do abono conforme o sexo e a idade:

    String nome = Prompt.lerLinha("Digite o nome do funcionário: ");
    int idade = Prompt.lerInteiro("Digite a idade do funcionário: ");
    String sexo = Prompt.lerLinha("Digite o sexo do funcionário (M para masculino, F para feminino): ");
    double salarioFixo = Prompt.lerDecimal("Digite o salário fixo do funcionário: ");

    double abono = CalcularAbono(idade, sexo);

    double salarioLiquido = salarioFixo + abono;

    System.out.println("Nome do funcionário: " + nome);
    System.out.println("Salário líquido acrescido do abono: " + salarioLiquido);
    }

    public static double CalcularAbono(int idade, String sexo) {
        double abono = 0;

        if (sexo.equalsIgnoreCase("M")) {
            if (idade >= 30) {
                abono = 100;
            } else {
                abono = 50;
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            if (idade >= 30) {
                abono = 200;
            } else {
                abono = 80;
            }
        }

        return abono;

    }        
}