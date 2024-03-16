public class Programa {
    public static void main(String[] args) {

    int numex = Prompt.lerInteiro("Digite o número do Exercicio que deseja executar: ");

    switch (numex) {
        case 1:
            Exercicio01.executar();
            break;

        case 2:
            Exercicio02.executar();
            break;

        case 3:
            Exercicio03.executar();
            break;

        case 4:
            Exercicio04.executar();
            break;

        case 5:
            Exercicio05.executar();
            break;

        default:
            System.out.println("Exercício não encontrado!");
            break;
        }
    }
}