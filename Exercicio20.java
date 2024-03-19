public class Exercicio20 {
    public static void executar(){

    System.out.println("Exercicio20");

    //20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula.
    //Faça um programaque calcule e exiba o salário de um professor.
    // Sabe-se que o valor da hora/aula segue a tabelaabaixo:Professor 
    //Nível 1 R$12,00 por hora/aulaProfessor Nível 2 R$17,00 por hora/aulaProfessor
    // Nível 3 R$25,00 por hora/aula

    int htrabalhadas = 40;
    int nivelp = 2;
    double salario;
    
    switch (nivelp) {
        case 1:
            salario = htrabalhadas * 12.00;
            break;
        case 2:
            salario = htrabalhadas * 17.00;
            break;
        case 3:
            salario = htrabalhadas * 25.00;
            break;
        default:
            System.out.println("Nível de professor inválido.");
            return;
    }

    System.out.println("O salário do professor é: R$" + salario);
}

}        