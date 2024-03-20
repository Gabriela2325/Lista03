public class Pessoa23 {
    private String nome;
    private String sexo;
    private double altura;
    private int idade;

    public Pessoa23(String nome, String sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public Pessoa23() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeParam) {
        nome = nomeParam;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexoParam) {
        sexo = sexoParam;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double alturaParam) {
        altura = alturaParam;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calcularPesoIdeal() {
        if (sexo.equalsIgnoreCase("M")) { 
            if (altura > 1.70) {
                if (idade <= 20) {
                    return 72.7 * altura - 58;
                } else if (idade >= 21 && idade <= 39) {
                    return 72.7 * altura - 53;
                } else if (idade >= 40) {
                    return 72.7 * altura - 45;
                }
            } else {
                if (idade <= 40) {
                    return 72.7 * altura - 50;
                } else {
                    return 72.7 * altura - 58;
                }
            }
        } else if (sexo.equalsIgnoreCase("F")) { 
            if (altura > 1.50) {
                if (idade >= 35) {
                    return 62.1 * altura - 45;
                } else {
                    return 62.1 * altura - 44.7;
                }
            } else {
                if (idade >= 35) {
                    return 62.1 * altura - 45;
                } else {
                    return 62.1 * altura - 49;
                }
            }
        }
        return 0;
    }

    public String toString() {
        double pesoIdeal = calcularPesoIdeal();
        return "Nome: " + nome + "\n" +
               "Sexo: " + sexo + "\n" +
               "Altura: " + altura + "\n" +
               "Idade: " + idade + "\n" +
               "Peso ideal: " + pesoIdeal + " kg";
    }
}