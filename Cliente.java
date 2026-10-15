public class Cliente extends Pessoa {
    private String endereco;
    private int pontosFidelidade;

    public Cliente(String nome, int cpf, String email, String endereco) {
        super(nome, cpf, email);
        this.endereco = endereco;
        this.pontosFidelidade = 0;
    }
    
    public void adicionarPontos(int pontos) {
        this.pontosFidelidade += pontos;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getPontosFidelidade() {
        return this.pontosFidelidade;
    }

    public String toString() {
        String retorno = super.toString() + String.format("Endereço: %s | Pontos fidelidade: %d", this.endereco, this.pontosFidelidade);
        return retorno;
    }
}
