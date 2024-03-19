public class Numeros09 {
    private int numerosintervalo;

    public Numeros09(int nParam) {
        numerosintervalo = nParam;
    }

    public Numeros09() {
        numerosintervalo = 0;
    }

    public int getnumerosintervalo() {
        return numerosintervalo;
    }

    public void setnumerosintervalo(int nParam) {
        numerosintervalo = nParam;
    }

    public String toString() {
        return "Quantidade de números no intervalo entre 10 e 150 (inclusive): " + numerosintervalo;
    }

    public void lerNumeros() {
        System.out.println("Digite os 80 números:");

        for (int i = 0; i < 80; i++) {
            int numero = Prompt.lerInteiro("Digite o número " + (i + 1) + ": ");
            if (numero >= 10 && numero <= 150) {
                numerosintervalo++;
            }
        }
    }
}