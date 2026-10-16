package pagamento;

import excecao.PagamentoRecusadoException;

public class PagamentoCartao implements Pagamento {
        
    private int parcelas;
    private double limite;

    public PagamentoCartao(int parcelas, double limite) {
        this.parcelas = parcelas;
        this.limite = limite;
    }
    
    public double calcularValorFinal(double valor) {
        if (this.parcelas > 3) {
            valor *= 1.08;
        }
        if (valor > this.limite) {
            throw new PagamentoRecusadoException();
        }
        return valor;
    }

    public String getDescricao() {
        return "Cartão";
    }
}
