package pagamento;

public interface Pagamento {
    double calcularValorFinal(double valor);
    String getDescricao();

    // O método default traz uma implementação direto na interface
    default void exibirComprovante(double valor) {
        System.out.printf("Pago via %s: R$ %.2f\n", getDescricao(), valor);
    }
}
