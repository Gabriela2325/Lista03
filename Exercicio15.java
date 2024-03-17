public class Exercicio15 {
    public static void executar(){

        System.out.println("Exercicio15");

        //15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. 
        //Façaum programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. 
        //O descontodeverá ser calculado sobre o valor do veículo de acordo com o combustível 
        //(álcool – 25%, gasolina– 21% ou diesel –14%).
        // Com valor do veículo zero encerra entrada de dados. Informe total dedesconto e total pago pelos clientes.

        double totalDesconto = 0;
        double totalPagoClientes = 0;

        while (true) {
            String tipoCombustivel = Prompt.lerLinha("Digite o tipo de combustível (álcool, gasolina, diesel) ou '0' para encerrar: ");

            if (tipoCombustivel.equalsIgnoreCase("álcool") || tipoCombustivel.equalsIgnoreCase("gasolina") || tipoCombustivel.equalsIgnoreCase("diesel")) {
                if (tipoCombustivel.equalsIgnoreCase("álcool")) {
                    calcularDesconto(0.25, totalDesconto, totalPagoClientes);
                } else if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
                    calcularDesconto(0.21, totalDesconto, totalPagoClientes);
                } else { // Combustível do tipo Diesel
                    calcularDesconto(0.14, totalDesconto, totalPagoClientes);
                }
            } else if (tipoCombustivel.equals("0")) {
                System.out.println("Encerrando entrada de dados.");
                break;
            } else {
                System.out.println("Tipo de combustível inválido. Tente novamente.");
            }
        }

        System.out.println("Total de desconto: " + totalDesconto);
        System.out.println("Total pago pelos clientes: " + totalPagoClientes);
    }

    public static void calcularDesconto(double percentualDesconto, double totalDesconto, double totalPagoClientes) {
        double valorVeiculo = Prompt.lerDecimal("Digite o valor do veículo: ");

        if (valorVeiculo == 0) {
            System.out.println("Valor do veículo zero. Encerrando entrada de dados.");
            return;
        }

        double desconto = valorVeiculo * percentualDesconto;
        double valorAPagar = valorVeiculo - desconto;

        System.out.println("Desconto: " + desconto);
        System.out.println("Valor a ser pago pelo cliente: " + valorAPagar);

        totalDesconto += desconto;
        totalPagoClientes += valorAPagar;
    }
}
