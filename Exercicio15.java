public class Exercicio15 {
    public static void executar(){

        System.out.println("Exercicio15");

        //15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. 
        //Façaum programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. 
        //O descontodeverá ser calculado sobre o valor do veículo de acordo com o combustível 
        //(álcool – 25%, gasolina– 21% ou diesel –14%).
        // Com valor do veículo zero encerra entrada de dados. Informe total dedesconto e total pago pelos clientes.

        double descontoTotal = 0;
        double totalClientes = 0;

        while (true) {
            String tipoCombustivel = Prompt.lerLinha("Digite o tipo de combustível (álcool, gasolina, diesel) ou '0' para encerrar: ");

            if (tipoCombustivel.equalsIgnoreCase("álcool") || tipoCombustivel.equalsIgnoreCase("gasolina") || tipoCombustivel.equalsIgnoreCase("diesel")) {
                double valorVeiculo = Prompt.lerDecimal("Digite o valor do veículo: ");
                if (valorVeiculo == 0) {
                    System.out.println("Valor do veículo zero. Encerrando entrada de dados.");
                    break;
                }

                Veiculo15 veiculo = new Veiculo15(tipoCombustivel, valorVeiculo);
                double desconto = veiculo.calcularDesconto();
                double valorAPagar = veiculo.calcularValorAPagar();

                descontoTotal += desconto;
                totalClientes += valorAPagar;

                System.out.println("Desconto: " + desconto);
                System.out.println("Valor a ser pago pelo cliente: " + valorAPagar);
            } else if (tipoCombustivel.equals("0")) {
                System.out.println("Encerrando entrada de dados.");
                break;
            } else {
                System.out.println("Tipo de combustível inválido. Tente novamente.");
            }
        }

        System.out.println("Total de desconto: " + descontoTotal);
        System.out.println("Total pago pelos clientes: " + totalClientes);
    }
}
