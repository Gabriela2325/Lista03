public class Exercicio14 {
    public static void executar(){

        System.out.println("Exercicio14");

        //14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos.
        // Mostrecomo resultado se houve lucro, prejuízo ou empate para cada produto. 
        //Informe média de preço decusto e do preço de venda.

        double Custo = 0;
        double Venda = 0;
        int Produtos = 0;
        int Lucro = 0;
        int Prejuizo = 0;
        int Empate = 0;

        for (int i = 0; i < 40; i++) {
            double precoCusto = Prompt.lerDecimal("Digite o preço de custo do produto " + (i + 1) + ": ");
            double precoVenda = Prompt.lerDecimal("Digite o preço de venda do produto " + (i + 1) + ": ");

            Custo += precoCusto;
            Venda += precoVenda;
            Produtos++;

            if (precoVenda > precoCusto) {
                System.out.println("Produto " + (i + 1) + ": Lucro");
                Lucro++;
            } else if (precoVenda < precoCusto) {
                System.out.println("Produto " + (i + 1) + ": Prejuízo");
                Prejuizo++;
            } else {
                System.out.println("Produto " + (i + 1) + ": Empate");
                Empate++;
            }
        }

        double mediaPrecoCusto = Custo / Produtos;
        double mediaPrecoVenda = Venda / Produtos;

        System.out.println("\nMédia de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);
        System.out.println("Total de produtos com lucro: " + Lucro);
        System.out.println("Total de produtos com prejuízo: " + Prejuizo);
        System.out.println("Total de produtos com empate: " + Empate);
    }
}

