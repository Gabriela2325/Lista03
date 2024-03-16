public class Exercicio12 {
    public static void executar(){

        System.out.println("Exercicio12");

        //12. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos comdesconto.
        // Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelocliente de vários carros.
        //O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000- 12% e acima de 2000 - 7%.
        // O sistema deverá perguntar se deseja continuar calculando descontoaté que a resposta seja: 
        //“(N) Não”. Informar total de carros com ano até 2000 e total geral.

        int total = 0;
        int Geral = 0;

        while (true) {
            int ano = Prompt.lerInteiro("Digite o ano do veículo: ");
            double valor = Prompt.lerDecimal("Digite o valor do veículo: ");

            double desconto;
                if (ano <= 2000) {
                    desconto = valor * 0.12;
                    total++;
                } else {
                    desconto = valor * 0.07; 
                }

            double valorAPagar = valor - desconto;
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a pagar pelo cliente: R$" + valorAPagar);

            Geral++;

            String continuar = Prompt.lerLinha("Deseja continuar calculando desconto? S/N: ");
                if (!continuar.equalsIgnoreCase("S")) {
                    break;
                }
        }

        System.out.println("Total de carros com ano até 2000: " + total);
        System.out.println("Total geral de carros calculados: " + Geral);
    }
}   
