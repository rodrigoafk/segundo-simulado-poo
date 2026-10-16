package produto;

public abstract class Produto {
  private String codigo;
  private String nome;
  private double precoBase;
  private int estoque;

  public Produto(String codigo, String nome, double precoBase, int estoque) {
    if (precoBase < 0) {
      throw new IllegalArgumentException("O preço base não pode ser negativo");
    }
    this.codigo = codigo;
    this.nome = nome;
    this.precoBase = precoBase;
    this.estoque = estoque;
  }

  public String getCodigo() {
    return this.codigo;
  }

  public String getNome() {
    return this.nome;
  }

  public double getPrecoBase() {
    return this.precoBase;
  }

  public int getEstoque() {
    return this.estoque;
  }

  public abstract double calcularPrecoFinal();

  public String exibirResumo() {
    double precoFinal = calcularPrecoFinal();
    return String.format("%s %s: R$%.2f", getCodigo(), getNome(), precoFinal);
  }

  public void baixarEstoque(int quantidade) {
    this.estoque -= quantidade;
  }
  
}
