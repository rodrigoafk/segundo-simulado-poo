package carrinho;

import excecao.PagamentoRecusadoException;
import modelo.Cliente;
import modelo.ClienteVip;
import pagamento.Pagamento;

public class Pedido {
    private Cliente cliente;
    private CarrinhoDeCompras carrinho;

    public Pedido (Cliente cliente, CarrinhoDeCompras carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }
    public void finalizar(Pagamento pagamento) {
        String cepCliente = cliente.getEndereco();
        double subtotal = carrinho.calcularTotal() + carrinho.calcularFreteTotal(cepCliente);

        if (this.cliente instanceof ClienteVip) {
            ClienteVip clienteVip = (ClienteVip) cliente;
            double desconto = subtotal * clienteVip.getPercentualDesconto();
            subtotal -= desconto;
        }
        try {
            subtotal = pagamento.calcularValorFinal(subtotal);
            pagamento.exibirComprovante(subtotal);

            int pontosFuturos = (int) (subtotal / 10);
            cliente.adicionarPontos(pontosFuturos);

        } catch (PagamentoRecusadoException e ){
            System.out.println("Pagamento recusado");
        } finally {
            System.out.println("Pedido encerrado");
        }
    }


}
