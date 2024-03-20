public class Exercicio22 {
    public static void executar(){

    System.out.println("Exercicio22");

    // 22. Faça um programa que calcule o valor da conta de luz de uma pessoa.
    // Sabe-se que o cálculoda conta de luz segue a tabela abaixo:
    //Tipo de Cliente Valor do KW/h1 (Residência) 0,602 (Comércio) 0,483 (Indústria) 1,29

    int tipoCliente = Prompt.lerInteiro("Selecione o tipo de cliente:\n1 - Residência\n2 - Comércio\n3 - Indústria\nDigite o número correspondente: ");
    double consumoEnergia = Prompt.lerDecimal("Digite o consumo de energia em kWh: ");

    Cliente22 cliente = new Cliente22(tipoCliente, consumoEnergia);

    double valorConta = cliente.calcularValorConta();
    System.out.println("O valor da conta de luz é: R$ " + valorConta);

    }     
}   
