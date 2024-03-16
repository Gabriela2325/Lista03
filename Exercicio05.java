public class Exercicio05 {
    public static void executar(){

        System.out.println("Exercicio05: ");

        //5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.
        //Faça um programa que receba um valor de uma compra e mostre o valor das prestações.

        double compra = Prompt.lerDecimal("Digite o valor da compra: ");

        System.out.println("O valor de cada prestação é de: R$ " + compra / 5);

    }
}
