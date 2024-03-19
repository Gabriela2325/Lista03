public class Exercicio16 {
    public static void executar(){

        System.out.println("Exercicio16");

        //16. Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionáriosde
        // acordo com os seguintes critérios:
        //a) 50% para aqueles que ganham menos do que três salários mínimos;
        //b) 20% para aqueles que ganham entre três até dez salários mínimos;
        //c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        //d) 10% para os demais funcionários.

    double minimo = Prompt.lerDecimal("Digite o valor do salário mínimo: ");

    int f50P = 0;
    int f20P = 0;
    int f15P = 0;
    int f10P = 0;

    for (int i = 0; i < 584; i++) {
        double salariofuncionario = Prompt.lerDecimal("Digite o salário do funcionário " + (i + 1) + ": ");

        if (salariofuncionario < 3 * minimo) {
            salariofuncionario *= 1.5; 
            f50P++;
        } else if (salariofuncionario >= 3 * minimo && salariofuncionario <= 10 * minimo) {
            f20P++;
        } else if (salariofuncionario > 10 * minimo && salariofuncionario <= 20 * minimo) {
            salariofuncionario *= 1.15; 
            f15P ++;
        } else {
            salariofuncionario *= 1.1; 
            f10P++;
        }
        System.out.println("Novo salário do funcionário " + (i + 1) + ": " + salariofuncionario);
    }

    System.out.println("Total de funcionários com reajuste de 50%: " + f50P);
    System.out.println("Total de funcionários com reajuste de 20%: " + f20P);
    System.out.println("Total de funcionários com reajuste de 15%: " + f15P);
    System.out.println("Total de funcionários com reajuste de 10%: " + f10P);

    }        
}