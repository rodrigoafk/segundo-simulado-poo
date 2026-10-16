package modelo;

public class ClienteVip extends Cliente {
    private double percentualDesconto;

    public ClienteVip(String nome, String cpf, String email, String endereco, double percentualDesconto) {
        // super para utilizar o construtor da classe pai (modelo.Cliente), que por sua vez também reutiliza o da classe pai (modelo.Pessoa)
        super(nome, cpf, email, endereco); 
        this.percentualDesconto = percentualDesconto;    
    }

    public String toString() {
        // multiplica-se o percentual por 100 para obter o formato de porcentagem e utiliza-se o Casting Explicito para deixar como int
        int porcentagem = (int) (getPercentualDesconto() * 100); 
        String retorno = super.toString() + String.format("| VIP (%d%%) ", porcentagem);
        return retorno;
    }

    public double getPercentualDesconto() {
        return this.percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}
