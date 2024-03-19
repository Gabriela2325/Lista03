public class Exercicio17 {
    public static void executar(){

    System.out.println("Exercicio17");

        //17. Leia o nome do funcionário, seu salário e o valor do salário mínimo.
        // Calcule o seu novo salárioreajustado. Escrever o nome do funcionário, o reajuste e seu novo salário.
        // Calcule quanto àempresa vai aumentar sua folha de pagamento.

    String nomeFuncionario = Prompt.lerLinha("Digite o nome do funcionário: ");

    double salariofuncionario = Prompt.lerDecimal("Digite o salário do funcionário: ");

    double minimo = Prompt.lerDecimal("Digite o valor do salário mínimo: ");

    double novo = Calcularsalarionovo(salariofuncionario, minimo);

    System.out.println("Nome do funcionário: " + nomeFuncionario);
    System.out.println("Reajuste: " + (novo - salariofuncionario));
    System.out.println("Novo salário: " + novo);

    double aumentoFolha = novo - salariofuncionario;
    System.out.println("Aumento na folha de pagamento da empresa: " + aumentoFolha);
    }

    public static double Calcularsalarionovo(double salario, double salarioMinimo) {
        if (salario < 3 * salarioMinimo) {
            return salario * 1.5; 
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            return salario * 1.2; 
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            return salario * 1.15; 
        } else {
            return salario * 1.1; 
        }

    }        
}