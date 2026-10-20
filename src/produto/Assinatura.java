package produto;

public class Assinatura extends Produto {
    private int meses;

    public Assinatura(String codigo, String nome, double precoBase, int estoque, int meses) {
        super(codigo, nome, precoBase, estoque);
        this.meses = meses;
    }

    public int getMeses() {
        return this.meses;
    }    

    @Override
    public double calcularPrecoFinal() {
        double total = getPrecoBase() * getMeses();
        if (meses >= 6) return total * 0.90; // Desconto de 10% se for assinatura de 6 meses ou mais
        return total;
    }
}
