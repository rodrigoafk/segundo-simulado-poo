package pagamento;

public class PagamentoPix implements Pagamento {
    public double calcularValorFinal(double valor) {
        return valor * 0.95;
    } // Desconto de 5% no pagamento PIX

    public String getDescricao() {
        return "Pix";
    }

}
