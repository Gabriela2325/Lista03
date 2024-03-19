public class Pessoa10 {
    private int quantidadePessoas;

    public Pessoa10(int nParam) {
        quantidadePessoas = nParam;
    }

    public Pessoa10() {
        quantidadePessoas = 0;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int nParam) {
        quantidadePessoas = nParam;
    }

    public String toString() {
        return "Quantidade de pessoas: " + quantidadePessoas;
    }

    public void verificarIdades() {
        System.out.println("Digite a idade de cada pessoa:");

        for (int i = 0; i < quantidadePessoas; i++) {
            int idade = Prompt.lerInteiro("Digite a idade da pessoa " + (i + 1) + ": ");

            if (idade >= 18) {
                System.out.println("Pessoa " + (i + 1) + ": Maior de idade");
            } else {
                System.out.println("Pessoa " + (i + 1) + ": Menor de idade");
            }
        }
    }
}