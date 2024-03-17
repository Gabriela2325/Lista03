public class Exercicio20 {
    public static void executar(){

    System.out.println("Exercicio20");

    //20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula.
    //Faça um programaque calcule e exiba o salário de um professor.
    // Sabe-se que o valor da hora/aula segue a tabelaabaixo:Professor 
    //Nível 1 R$12,00 por hora/aulaProfessor Nível 2 R$17,00 por hora/aulaProfessor
    // Nível 3 R$25,00 por hora/aula

    int lado1 = Prompt.lerInteiro("Digite o comprimento do primeiro lado: ");
    int lado2 = Prompt.lerInteiro("Digite o comprimento do segundo lado: ");
    int lado3 = Prompt.lerInteiro("Digite o comprimento do terceiro lado: ");

    if (Triangulo(lado1, lado2, lado3)) {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Os lados formam um triângulo equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Os lados formam um triângulo isósceles.");
        } else {
            System.out.println("Os lados formam um triângulo escaleno.");
        }
    } else {
        System.out.println("Os lados não formam um triângulo.");
    }
    }

    public static boolean Triangulo(int lado1, int lado2, int lado3) {
     
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}        