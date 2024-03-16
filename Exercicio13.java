public class Exercicio13 {
    public static void executar(){

        System.out.println("Exercicio13");

        //13. Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e 
        //informese está apta ou não para cumprir o serviço militar obrigatório.
        // Informe os totais

        int pessoas = Prompt.lerInteiro("Digite o número de pessoas: ");
        int aptas = 0;
        int inaptas = 0;

        for (int i = 0; i < pessoas; i++) {
            String nome = Prompt.lerLinha("Digite o nome da pessoa " + (i + 1) + ": ");
            String sexo;

            do {
                sexo = Prompt.lerLinha("Digite o sexo da pessoa (M para masculino, F para feminino): ");
                sexo = sexo.toUpperCase(); 
            } while (!sexo.equals("M") && !sexo.equals("F"));

            int idade = Prompt.lerInteiro("Digite a idade da pessoa: ");
            String saude = Prompt.lerLinha("Digite a saúde da pessoa (Boa ou Ruim): ");

            boolean apto = (sexo.equals("M") && idade >= 18 && saude.equalsIgnoreCase("Boa"));

            if (apto) {
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
                aptas++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar obrigatório.");
                inaptas++;
            }
        }

        System.out.println("Total de pessoas aptas: " + aptas);
        System.out.println("Total de pessoas inaptas: " + inaptas);
    }
}
