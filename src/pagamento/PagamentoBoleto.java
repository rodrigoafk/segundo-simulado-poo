package pagamento;

public class PagamentoBoleto implements Pagamento {
    
    public double calcularValorFinal(double valor) {
        return valor;
    } // No boleto não há taxas nem descontos

    public String getDescricao() {
        return "Boleto";
    }

    
}
