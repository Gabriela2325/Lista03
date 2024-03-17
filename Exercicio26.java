public class Exercicio26 {
    public static void executar(){

    System.out.println("Exercicio26");

    //6. Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado.
    //Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices deseguro.
    // Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto.
    //A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco.
    // Dados nome,idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria.
    // Caso aidade não esteja na faixa necessária, 
    //imprimir uma mensagem informando que ele não se enquadraem nenhuma das categorias ofertadas

    String pretendente = Prompt.lerLinha("Digite o nome do pretendente: ");
        int idade = Prompt.lerInteiro("Digite a idade do pretendente: ");
        String grupoRisco = Prompt.lerLinha("Digite o grupo de risco do pretendente (baixo, médio ou alto): ");

        String categoria = determinarCategoriaSeguro(idade, grupoRisco);

        if (categoria != null) {
            System.out.println("Nome do pretendente: " + pretendente);
            System.out.println("Idade do pretendente: " + idade);
            System.out.println("Grupo de risco do pretendente: " + grupoRisco);
            System.out.println("Categoria de seguro: " + categoria);
        } else {
            System.out.println("O pretendente não se enquadra em nenhuma das categorias de seguro ofertadas.");
        }
    }

    public static String determinarCategoriaSeguro(int idade, String grupoRisco) {
        
        if (idade < 17 || idade > 70) {
            return null;
        }

        if (idade >= 17 && idade <= 20) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                return "Categoria 1";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                return "Categoria 2";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                return "Categoria 3";
            }
        } else if (idade >= 21 && idade <= 24) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                return "Categoria 2";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                return "Categoria 3";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                return "Categoria 4";
            }
        } else if (idade >= 25 && idade <= 34) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                return "Categoria 3";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                return "Categoria 4";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                return "Categoria 5";
            }
        } else if (idade >= 35 && idade <= 64) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                return "Categoria 4";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                return "Categoria 5";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                return "Categoria 6";
            }
        } else if (idade >= 65 && idade <= 70) {
            if (grupoRisco.equalsIgnoreCase("baixo")) {
                return "Categoria 7";
            } else if (grupoRisco.equalsIgnoreCase("médio")) {
                return "Categoria 8";
            } else if (grupoRisco.equalsIgnoreCase("alto")) {
                return "Categoria 9";
            }
        }

        return null;

    }
}