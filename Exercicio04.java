public class Exercicio04 {
    public static void executar(){

        System.out.println("Exercicio04: ");

        //4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de umvalor 
        //lido em dólar (US$). O programa deverá solicitar o 
        //valor da cotação do dólar e também aquantidade de dólares disponíveis com o usuário

        double cotacaoD = Prompt.lerDecimal("Digite a cotação do dólar R$/US$: ");

        double quantidadeD = Prompt.lerDecimal("Digite a quantidade de dólares disponíveis: ");

        System.out.println("Valor em reais da quantidade de dólares disponíveis: R$ " + cotacaoD * quantidadeD);

    }
}
