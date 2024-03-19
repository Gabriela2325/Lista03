public class Exercicio06 {
    public static void executar(){

        System.out.println("Exercicio06");

        //6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda.
        // Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelousuário.

        double custo = Prompt.lerDecimal("Digite o preço de custo do produto: ");
        double acrescimo = Prompt.lerDecimal("Digite o percentual de acréscimo (%): ");

        Produto06 produto = new Produto06(custo);
        double precoVenda = produto.calcularPrecoVenda(acrescimo);

        System.out.println("O valor de venda do produto é de: R$ " + precoVenda);
    }
}
