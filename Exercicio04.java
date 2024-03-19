public class Exercicio04 {
    public static void executar(){

        System.out.println("Exercicio04: ");

        //4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de umvalor 
        //lido em dólar (US$). O programa deverá solicitar o 
        //valor da cotação do dólar e também aquantidade de dólares disponíveis com o usuário

        double cotacao = Prompt.lerDecimal("Digite a cotação do dólar: ");
        double quantidade = Prompt.lerDecimal("Digite a quantidade de dólares disponíveis: ");

        Conversor04 conversor = new Conversor04(cotacao, quantidade);

        System.out.println(conversor);
    }
}
