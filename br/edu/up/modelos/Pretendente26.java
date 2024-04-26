package br.edu.up.modelos;

public class Pretendente26 {
    private String nome;
    private int idade;
    private String grupoRisco;

    public Pretendente26(String nomeParam, int idadeParam, String grupoRiscoParam) {
        nome = nomeParam;
        idade = idadeParam;
        grupoRisco = grupoRiscoParam;
    }

    public Pretendente26() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeParam) {
        nome = nomeParam;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idadeParam) {
        idade = idadeParam;
    }

    public String getGrupoRisco() {
        return grupoRisco;
    }

    public void setGrupoRisco(String grupoRisco) {
        this.grupoRisco = grupoRisco;
    }

    public String determinarCategoriaSeguro() {
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

    public String toString() {
        String categoria = determinarCategoriaSeguro();
        if (categoria != null) {
            return "Nome do pretendente: " + nome + "\n" +
                    "Idade do pretendente: " + idade + "\n" +
                    "Grupo de risco do pretendente: " + grupoRisco + "\n" +
                    "Categoria de seguro: " + categoria;
        } else {
            return "O pretendente não se enquadra em nenhuma das categorias de seguro ofertadas.";
        }
    }
}