public class Exercicio23 {
    public static void executar(){

    System.out.println("Exercicio23");

    // 23. Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. 
    //Calcule e mostrenome e o seu peso ideal de acordo com as seguintes características da pessoa:

    String nome = Prompt.lerLinha("Digite o nome da pessoa: ");
    String sexo = Prompt.lerLinha("Digite o sexo da pessoa (M para masculino, F para feminino): ");
    double altura = Prompt.lerDecimal("Digite a altura da pessoa em metros: ");
    int idade = Prompt.lerInteiro("Digite a idade da pessoa: ");

    double pesoIdeal = calcularPesoIdeal(sexo, altura, idade);

    System.out.println("Nome da pessoa: " + nome);
    System.out.println("Peso ideal: " + pesoIdeal + " kg");
    }

    public static double calcularPesoIdeal(String sexo, double altura, int idade) {
        double pesoIdeal = 0;
        if (sexo.equalsIgnoreCase("M")) { // Para homens
            if (altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = 72.7 * altura - 58;
                } else if (idade >= 21 && idade <= 39) {
                    pesoIdeal = 72.7 * altura - 53;
                } else if (idade >= 40) {
                    pesoIdeal = 72.7 * altura - 45;
                }
            } else {
                if (idade <= 40) {
                    pesoIdeal = 72.7 * altura - 50;
                } else {
                    pesoIdeal = 72.7 * altura - 58;
                }
            }
            } else if (sexo.equalsIgnoreCase("F")) { // Para mulheres
                if (altura > 1.50) {
                    if (idade >= 35) {
                        pesoIdeal = 62.1 * altura - 45;
                    } else {
                        pesoIdeal = 62.1 * altura - 44.7;
                    }
                } else {
                    if (idade >= 35) {
                    pesoIdeal = 62.1 * altura - 45;
                } else {
                    pesoIdeal = 62.1 * altura - 49;
                }
                }
            }
                return pesoIdeal;
    }
}   
