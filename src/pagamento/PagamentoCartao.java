package pagamento;

import excecao.PagamentoRecusadoException;

public class PagamentoCartao implements Pagamento {
        
    private int parcelas;
    private double limite;

    public PagamentoCartao(int parcelas, double limite) {
        this.parcelas = parcelas;
        this.limite = limite;
    }

    @Override
    public double calcularValorFinal(double valor) {
        // Taxa de 8% caso seja parcelado em mais de três vezes
        if (this.parcelas > 3) {
            valor *= 1.08;
        }
        // Se ultrapassar o limite do cartão estoura a exceção
        if (valor > this.limite) {
            throw new PagamentoRecusadoException();
        }
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Cartão";
    }
}
