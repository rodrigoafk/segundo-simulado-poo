package excecao;

public class PagamentoRecusadoException extends RuntimeException {
    public PagamentoRecusadoException() {
        super("Pagamento recusado");
    }
}
