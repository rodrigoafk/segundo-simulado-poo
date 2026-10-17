package carrinho;

import entrega.Entregavel;
import excecao.EstoqueInsuficienteException;
import produto.Produto;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>(); 
    }

    // Adiciona 1 unidade e reduz estoque
    public void adicionar(Produto p) throws EstoqueInsuficienteException {
        if (p.getEstoque() < 1) {
            throw new EstoqueInsuficienteException(p.getNome(), p.getEstoque());
        }
        this.itens.add(p);
        p.baixarEstoque(1);
    }

    public void adicionar(Produto p, int quantidade) throws EstoqueInsuficienteException {
        if (quantidade > p.getEstoque()) {
            throw new EstoqueInsuficienteException(p.getNome(), p.getEstoque());
        }
        for (int i = 1; i <= quantidade; i++) {
            this.itens.add(p);
        }
        p.baixarEstoque(quantidade);
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

        for (Produto item : this.itens) { // Percorrer os elementos da ArrayList
            if (item instanceof Entregavel) { // instanceof para filtrar só os itens que implementam Entregavel
                Entregavel produtoEntregavel = (Entregavel) item;
                totalFrete += produtoEntregavel.calcularFrete(cep);
            }
        }
        return totalFrete;
    }

    

    

    
}
