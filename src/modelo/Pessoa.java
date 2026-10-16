package modelo;

public class Pessoa {
    private String nome;
    private String cpf;  // cpf como String pois o tipo int descarta zeros à esquerda, além de risco de overflow
    private String email;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String toString() {
        String retorno = String.format("Nome: %s | CPF: %s ", this.nome, this.cpf);
        return retorno;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
