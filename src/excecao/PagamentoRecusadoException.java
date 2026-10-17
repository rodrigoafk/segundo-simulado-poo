package excecao;

// Na excessão não checada o tratamento é opcional pelo compilador
public class PagamentoRecusadoException extends RuntimeException {
    public PagamentoRecusadoException() {
        super("Pagamento recusado");
    }
}
