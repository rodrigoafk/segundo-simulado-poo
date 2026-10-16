package entrega;

public interface Entregavel {
    double calcularFrete(String cep);
    int prazoEntregaDias(String cep);
}
