package entrega;

public interface Entregavel {
    double calcularFrete(String cep);

    // No enunciado é solicitado que o método não tenha parametros, no entanto eu adicionei pois o prazo depende dele.
    int prazoEntregaDias(String cep);
}
