public class Exercicio21 {
    public static void executar(){

    System.out.println("Exercicio21");

    // 21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintescategorias:
    //Infantil A = 5 - 7 anosInfantil B = 8 - 10 anosjuvenil A = 11- 13 anosjuvenil B = 14 - 17 
    //anosSênior = 18 - 25 anosApresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado

    int idadeNadador = Prompt.lerInteiro("Digite a idade do nadador: ");

    Narrador21 narrador = new Narrador21(idadeNadador);

    String categoriaNadador = narrador.classificarNadador();
    System.out.println("Categoria do nadador: " + categoriaNadador);
    
    }
}        