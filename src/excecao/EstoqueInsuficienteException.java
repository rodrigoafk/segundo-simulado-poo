package excecao;


// Exceção checada obriga tratamento com try-catch/throws
public class EstoqueInsuficienteException extends Exception {
    public EstoqueInsuficienteException(String nomeProduto, int quantidadeDisponivel) {
        super(String.format("Estoque insuficiente para %s. Disponível: %d", nomeProduto, quantidadeDisponivel));
    }
}
