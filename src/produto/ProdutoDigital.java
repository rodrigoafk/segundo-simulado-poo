package produto;

public class ProdutoDigital extends Produto {
    private int tamanhoMB;

    public ProdutoDigital(String codigo, String nome, double precoBase, int estoque, int tamanhoMB) {
        super(codigo, nome, precoBase, estoque);
        this.tamanhoMB = tamanhoMB;
    }

    public int getTamanhoMB() {
        return this.tamanhoMB;
    }    

    public double calcularPrecoFinal() {
        return getPrecoBase() * 0.95;
    }
}
