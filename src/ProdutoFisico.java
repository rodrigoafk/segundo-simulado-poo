public class ProdutoFisico extends Produto {
    private double pesoKg;

    public ProdutoFisico(String codigo, String nome, double precoBase, int estoque, double pesoKg) {
        super(codigo, nome, precoBase, estoque);
        this.pesoKg = pesoKg;
    }

    public double getPesoKg() {
        return this.pesoKg;
    }

    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.10;
    }
}
