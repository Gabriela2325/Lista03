public class Programa {
    public static void main(String[] args) {

        int numex = Prompt.lerInteiro("Digite o número do Exercicio que deseja executar: ");

        switch (numex) {
            case 1:
                Exercicio01.executar();
                break;

        default:
            System.out.println("Exercício não encontrado!");
            break;
        }
    }
}