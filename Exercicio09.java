public class Exercicio09 {
    public static void executar(){

        System.out.println("Exercicio09");

        //9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre
        // 10 (inclusive)e 150 (inclusive)

        int contador = 0; 

        for (int i = 0; i < 80; i++) {
            int numero = Prompt.lerInteiro("Digite o número " + (i + 1) + ": ");

            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        System.out.println("Quantidade de números no intervalo entre 10 e 150 (inclusive): " + contador);
        
    }
}
