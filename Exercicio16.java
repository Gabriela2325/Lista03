public class Exercicio16 {
    public static void executar(){

        System.out.println("Exercicio16");

        //16. Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionáriosde
        // acordo com os seguintes critérios:
        //a) 50% para aqueles que ganham menos do que três salários mínimos;
        //b) 20% para aqueles que ganham entre três até dez salários mínimos;
        //c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        //d) 10% para os demais funcionários.

        double salarioMinimo = Prompt.lerDecimal("Digite o valor do salário mínimo: ");

        int funcionarios50Percent = 0;
        int funcionarios20Percent = 0;
        int funcionarios15Percent = 0;
        int funcionarios10Percent = 0;

        for (int i = 0; i < 584; i++) {
            double salarioFuncionario = Prompt.lerDecimal("Digite o salário do funcionário " + (i + 1) + ": ");

            if (salarioFuncionario < 3 * salarioMinimo) {
                salarioFuncionario *= 1.5; 
                funcionarios50Percent++;
            } else if (salarioFuncionario >= 3 * salarioMinimo && salarioFuncionario <= 10 * salarioMinimo) {
                funcionarios20Percent++;
            } else if (salarioFuncionario > 10 * salarioMinimo && salarioFuncionario <= 20 * salarioMinimo) {
                salarioFuncionario *= 1.15; 
                funcionarios15Percent++;
            } else {
                salarioFuncionario *= 1.1; 
                funcionarios10Percent++;
            }

            System.out.println("Novo salário do funcionário " + (i + 1) + ": " + salarioFuncionario);
        }

        System.out.println("Total de funcionários com reajuste de 50%: " + funcionarios50Percent);
        System.out.println("Total de funcionários com reajuste de 20%: " + funcionarios20Percent);
        System.out.println("Total de funcionários com reajuste de 15%: " + funcionarios15Percent);
        System.out.println("Total de funcionários com reajuste de 10%: " + funcionarios10Percent);
    }        
}