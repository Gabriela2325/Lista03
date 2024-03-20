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
        int totalFuncionarios = 584;

        int f50P = 0;
        int f20P = 0;
        int f15P = 0;
        int f10P = 0;

        for (int i = 0; i < totalFuncionarios; i++) {
            double salarioFuncionario = Prompt.lerDecimal("Digite o salário do funcionário " + (i + 1) + ": ");
            Funcionario16 funcionario = new Funcionario16(salarioFuncionario);

            funcionario.aplicarReajuste(minimo);

            if (funcionario.getNovoSalario() == salarioFuncionario * 1.5) {
                f50P++;
            } else if (funcionario.getNovoSalario() == salarioFuncionario * 1.2) {
                f20P++;
            } else if (funcionario.getNovoSalario() == salarioFuncionario * 1.15) {
                f15P++;
            } else {
                f10P++;
            }

            System.out.println("Novo salário do funcionário " + (i + 1) + ": " + funcionario.getNovoSalario());
        }

        System.out.println("Total de funcionários com reajuste de 50%: " + f50P);
        System.out.println("Total de funcionários com reajuste de 20%: " + f20P);
        System.out.println("Total de funcionários com reajuste de 15%: " + f15P);
        System.out.println("Total de funcionários com reajuste de 10%: " + f10P);

    }        
}