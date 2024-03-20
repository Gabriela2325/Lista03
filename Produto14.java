import java.util.ArrayList;
import java.util.List;

public class Produto14 {
    private double pCusto;
    private double pVenda;

    public Produto14(double cParam, double vParam) {
        pCusto = cParam;
        pVenda = vParam;
    }

    public Produto14() {
        this(0, 0);
    }

    public double getPrecoCusto() {
        return pCusto;
    }

    public void setPrecoCusto(double cParam) {
        pCusto = cParam;
    }

    public double getPrecoVenda() {
        return pVenda;
    }

    public void setPrecoVenda(double vParam) {
        pVenda = vParam;
    }

    public String lucroOuPrejuizo() {
        if (pVenda > pCusto) {
            return "Lucro";
        } else if (pCusto < pVenda) {
            return "Prejuízo";
        } else {
            return "Empate";
        }
    }

    public String toString() {
        return "Preço de custo: " + pCusto + "\n" +
               "Preço de venda: " + pVenda + "\n" +
               "Resultado: " + lucroOuPrejuizo();
    }

    public static List<Produto14> criarProdutos() {
        List<Produto14> produtos = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            produtos.add(new Produto14());
        }
        return produtos;
    }
}