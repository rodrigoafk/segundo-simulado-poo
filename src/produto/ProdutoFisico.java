package produto;

import entrega.Entregavel;

public class ProdutoFisico extends Produto implements Entregavel {
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

    public double calcularFrete(String cep) {
        return 15.0 + (getPesoKg() * 2.00);
    }

    public int prazoEntregaDias(String cep) {
        if (cep.charAt(0) == '6') return 7;
        return 12;
    }

}
