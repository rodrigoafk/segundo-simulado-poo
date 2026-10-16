public class PagamentoPix implements Pagamento {
    public double calcularValorFinal(double valor) {
        return valor * 0.95;
    }

    public String getDescricao() {
        return "Pix";
    }

}
