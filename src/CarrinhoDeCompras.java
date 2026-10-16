import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>(); 
    }

    public void adicionar(Produto p) {
        this.itens.add(p);    
    }

    public void adicionar(Produto p, int quantidade) {
        for (int i = 1; i <= quantidade; i++) {
            this.itens.add(p);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto item : this.itens) {
            total += item.calcularPrecoFinal();
        }
        return total;
    }

    public double calcularFreteTotal(String cep) {
        double totalFrete = 0;

        for (Produto item : this.itens) {
            if (item instanceof Entregavel) {
                Entregavel produtoEntregavel = (Entregavel) item;
                totalFrete += produtoEntregavel.calcularFrete(cep);
            }
        }
        return totalFrete;
    }

    

    

    
}
