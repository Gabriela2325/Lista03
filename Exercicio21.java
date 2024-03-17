public class Exercicio21 {
    public static void executar(){

    System.out.println("Exercicio21");

    // 21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintescategorias:
    //Infantil A = 5 - 7 anosInfantil B = 8 - 10 anosjuvenil A = 11- 13 anosjuvenil B = 14 - 17 
    //anosSênior = 18 - 25 anosApresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado

    int idade = Prompt.lerInteiro("Digite a idade do nadador: ");

    String categoria = classificarNadador(idade);

    System.out.println("Categoria do nadador: " + categoria);
    }

    public static String classificarNadador(int idade) {

        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            return "Sênior";
        } else {
            return "Fora da faixa etária";
        }
    }
}        