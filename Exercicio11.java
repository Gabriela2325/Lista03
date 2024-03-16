public class Exercicio11 {
    public static void executar(){

        System.out.println("Exercicio11");

        //11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o 
        //nome e se ela é homem ou mulher.
        //No final informe total de homens e de mulheres

        int Homens = 0;
        int Mulheres = 0;

        for (int i = 0; i < 56; i++) {
            String nome = Prompt.lerLinha("Digite o nome da pessoa " + (i + 1) + ": ");
            String sexo;

            do {
                sexo = Prompt.lerLinha("Digite o sexo da pessoa (H para homem, M para mulher): ");
                sexo = sexo.toUpperCase(); 
            } while (!sexo.equals("H") && !sexo.equals("M")); 

            if (sexo.equals("H")) {
                System.out.println(nome + " - Homem");
                Homens++;
            } else if (sexo.equals("M")) {
                System.out.println(nome + " - Mulher");
                Mulheres++;
            }
        }

        System.out.println("Total de homens: " + Homens);
        System.out.println("Total de mulheres: " + Mulheres);
    }   
}