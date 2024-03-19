public class Exercicio05 {
    public static void executar(){

        System.out.println("Exercicio05: ");

        //5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.
        //Faça um programa que receba um valor de uma compra e mostre o valor das prestações.

        Compra05 compra = new Compra05();

        compra.setNomeProduto(Prompt.lerLinha("Digite o nome do produto: "));
        compra.setPrecoProduto(Prompt.lerDecimal("Digite o preço do produto: "));
        compra.setQuantidade(Prompt.lerInteiro("Digite a quantidade: "));

        double valorTC = compra.calcularVT();

        System.out.println("O valor de cada prestação é de: R$ " + valorTC / 5);

    }
}
