package modelo;

public class Funcionario extends Pessoa {
    private String matricula;
    private double salario;

    public Funcionario(String nome, String cpf, String email, String matricula, double salario) {
        super(nome, cpf, email); // reuso do construtor de Pessoa
        this.matricula = matricula;
        this.salario = salario;
    }

}
