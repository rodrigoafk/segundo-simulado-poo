public class PagamentoBoleto implements Pagamento {
    
    public double calcularValorFinal(double valor) {
        return valor;
    }

    public String getDescricao() {
        return "Boleto";
    }

    
}
