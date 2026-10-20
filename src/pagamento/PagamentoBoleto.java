package pagamento;

public class PagamentoBoleto implements Pagamento {

    @Override
    public double calcularValorFinal(double valor) {
        return valor;
    } // No boleto não há taxas nem descontos

    @Override
    public String getDescricao() {
        return "Boleto";
    }

    
}
