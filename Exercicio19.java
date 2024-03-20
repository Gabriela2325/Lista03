public class Exercicio19 {
    public static void executar(){

    System.out.println("Exercicio19");

    //19. Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados deum triângulo.
    // Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ouescaleno.Propriedade:
    // o comprimento de cada lado de um triângulo é menor do que a soma doscomprimentos dos outros dois lados.
    //Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;Triângulo Isóscele: 
    //aquele que tem os comprimentos de dois lados iguais. Portanto, todotriângulo equilátero é também isóscele;
    //Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes

    int lado1 = Prompt.lerInteiro("Digite o comprimento do primeiro lado: ");
    int lado2 = Prompt.lerInteiro("Digite o comprimento do segundo lado: ");
    int lado3 = Prompt.lerInteiro("Digite o comprimento do terceiro lado: ");

    Triangulo19 triangulo = new Triangulo19(lado1, lado2, lado3);

    System.out.println("Os lados formam um triângulo " + triangulo.tipoTriangulo());
    
    }
}        