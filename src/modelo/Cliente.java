package modelo;

public class Cliente extends Pessoa {
    private String endereco;
    private int pontosFidelidade;

    public Cliente(String nome, String cpf, String email, String endereco) {
        super(nome, cpf, email);
        this.endereco = endereco;
        this.pontosFidelidade = 0; // inicializando pontosFidelidade em 0 assim que é instanciado
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

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }

    @Override
    public String toString() {
        // super.toString() para acessar o respectivo método da classe pai
        String retorno = super.toString() + String.format("| Endereço: %s | Pontos fidelidade: %d ", this.endereco, this.pontosFidelidade); 
        return retorno;
    }
}
