public class PagamentoCartao implements Pagamento {
        
    private int parcelas;

    public PagamentoCartao(int parcelas) {
        this.parcelas = parcelas;
    }
    
    public double calcularValorFinal(double valor) {
        if (this.parcelas > 3) {
            valor *= 1.08;
        }
        return valor;
    }

    public String getDescricao() {
        return "Cartão";
    }
}
