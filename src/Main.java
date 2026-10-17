import carrinho.CarrinhoDeCompras;
import carrinho.Pedido;
import excecao.EstoqueInsuficienteException;
import modelo.ClienteVip;
import pagamento.PagamentoCartao;
import pagamento.PagamentoPix;
import produto.Assinatura;
import produto.ProdutoDigital;
import produto.ProdutoFisico;

public class Main {

    public static void main(String[] args) {
        ClienteVip cliente1 = new ClienteVip("Victoria Dias", "11122233344", "victoriadias@email.com", "60000000", 0.15);

        Assinatura itemAssinatura = new Assinatura("1111", "Spotify Premium", 21.0, 1000, 7);
        ProdutoFisico itemFisico = new ProdutoFisico("2222", "Smart TV 50'", 4000.0, 16, 10);
        ProdutoDigital itemDigital = new ProdutoDigital("3333", "Dead by Daylight", 70.0, 1000, 50);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        try {
            carrinho.adicionar(itemAssinatura);
            carrinho.adicionar(itemFisico);
            carrinho.adicionar(itemDigital);
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro ao adicionar item: " + e.getMessage());
        }

        System.out.println("Tentativa 1");
        PagamentoPix pix = new PagamentoPix();
        Pedido pedido1 = new Pedido(cliente1, carrinho);
        pedido1.finalizar(pix);

        System.out.println("Tentativa 2");
        PagamentoCartao cartao = new PagamentoCartao(6, 100.0);
        Pedido pedido2 = new Pedido(cliente1, carrinho);
        pedido2.finalizar(cartao);

    }
}
