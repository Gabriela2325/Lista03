public class Exercicio02 {
    public static void executar(){
        System.out.println("Exercicio02: ");

        //2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida
        // adistância total percorrida pelo automóvel e o total de combustível gasto.

        double dTotal = Prompt.lerDecimal("Digite a distância total percorrida em KM: ");

        double Gasto = Prompt.lerDecimal("Digite o total de combustível gasto em L: ");
 
        double consumoM = dTotal / Gasto;

        System.out.println("O consumo médio do automóvel é de: " + consumoM + " km/l");
    }
    
}
