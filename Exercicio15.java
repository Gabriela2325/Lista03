public class Exercicio15 {
    public static void executar(){

        System.out.println("Exercicio15");

        //15. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. 
        //Façaum programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. 
        //O descontodeverá ser calculado sobre o valor do veículo de acordo com o combustível 
        //(álcool – 25%, gasolina– 21% ou diesel –14%).
        // Com valor do veículo zero encerra entrada de dados. Informe total dedesconto e total pago pelos clientes.

        double descontototal = 0;
        double totalclientes = 0;

        while (true) {
            String combustivel = Prompt.lerLinha("Digite o tipo de combustível (álcool, gasolina, diesel) ou '0' para encerrar: ");

            if (combustivel.equalsIgnoreCase("álcool") || combustivel.equalsIgnoreCase("gasolina") || combustivel.equalsIgnoreCase("diesel")) {
                if (combustivel.equalsIgnoreCase("álcool")) {

                    CalcularDesconto(0.25, descontototal, totalclientes);

                } else if (combustivel.equalsIgnoreCase("gasolina")) {

                    CalcularDesconto(0.21, descontototal, totalclientes);

                } else { 

                    CalcularDesconto(0.14, descontototal, totalclientes);
                }

            } else if (combustivel.equals("0")) {
                
                System.out.println("Encerrando entrada de dados.");
                break;
    
            } else {
                System.out.println("Tipo de combustível inválido. Tente novamente.");
            }
        }

        System.out.println("Total de desconto: " + descontototal);
        System.out.println("Total pago pelos clientes: " + totalclientes);
    }

    public static void CalcularDesconto(double percentualdesconto, double descontototal, double totalclientes) {
        double veiculo = Prompt.lerDecimal("Digite o valor do veículo: ");

        if (veiculo == 0) {
            System.out.println("Valor do veículo zero. Encerrando entrada de dados.");
            return;
        }

        double desconto = veiculo * percentualdesconto;
        double valorapagar = veiculo - desconto;

        System.out.println("Desconto: " + desconto);
        System.out.println("Valor a ser pago pelo cliente: " + valorapagar);

        descontototal += desconto;
        totalclientes += valorapagar;
    }
}
