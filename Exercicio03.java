public class Exercicio03 {
    public static void executar(){
        System.out.println("Exercicio03: ");

        //3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendasefetuadas
        // por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobresuas vendas efetuadas,
        // informar o seu nome, o salário fixo e salário no final do mês

        String vendedor = Prompt.lerLinha("Digite o nome do vendedor: ");

        double salarioF = Prompt.lerDecimal("Digite o salário fixo do vendedor: ");

        double vendas = Prompt.lerDecimal("Digite o total de vendas efetuadas pelo vendedor no mês: ");

        double comissao = 0.15 * vendas;

        double salarioT = salarioF + comissao;

        System.out.println("Nome do vendedor: " + vendedor);
        System.out.println("Salário fixo: R$ " + salarioF);
        System.out.println("Salário no final do mês: R$ " + salarioT);
    }
}
