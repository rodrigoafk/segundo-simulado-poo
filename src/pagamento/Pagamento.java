package pagamento;

public interface Pagamento {
    double calcularValorFinal(double valor);
    String getDescricao();
    default void exibirComprovante(double valor) {
        double valorFinal = calcularValorFinal(valor);
        System.out.printf("Pago via %s: R$ %.2f\n", getDescricao(), valorFinal);
    }
}
