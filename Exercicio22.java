public class Exercicio22 {
    public static void executar(){

    System.out.println("Exercicio22");

    // 22. Faça um programa que calcule o valor da conta de luz de uma pessoa.
    // Sabe-se que o cálculoda conta de luz segue a tabela abaixo:
    //Tipo de Cliente Valor do KW/h1 (Residência) 0,602 (Comércio) 0,483 (Indústria) 1,29

    int tipoCliente = Prompt.lerInteiro("Selecione o tipo de cliente:\n1 - Residência\n2 - Comércio\n3 - Indústria\nDigite o número correspondente: ");

    double consumoEnergia = Prompt.lerDecimal("Digite o consumo de energia em kWh: ");

    double valorKWh = calcularValorKWh(tipoCliente);
    double valorConta = consumoEnergia * valorKWh;

    System.out.println("O valor da conta de luz é: R$ " + valorConta);
    }

    public static double calcularValorKWh(int tipoCliente) {

    switch (tipoCliente) {
        case 1: 
            return 0.602;
        case 2: 
            return 0.483;
        case 3: 
            return 1.29;
        default:
            System.out.println("Tipo de cliente inválido. Usando valor padrão para residência.");
            return 0.602;
            }
        }     
    }   
