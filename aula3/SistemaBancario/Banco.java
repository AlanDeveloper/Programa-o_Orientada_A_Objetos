package aula3.SistemaBancario;

public class Banco {
  private static Integer proxBanco = 1;
  private Integer id;
  private Integer prox_conta;
  private Integer ind_array;
  private String nome;
  private Conta[] contas;
  private Integer maxContas = 10;

  public Banco(String nome) {
    this.id = proxBanco++;
    this.nome = nome;
    this.contas = new Conta[this.maxContas];
    this.prox_conta = 1;
    this.ind_array = 0;
  }

  public String getNome() {
    return this.nome;
  }

  public Integer getCodigo() {
    return this.id;
  }

  public Conta criaConta(String nome) {
    Conta c = null;

    if (this.prox_conta != this.maxContas) {
      c = new Conta(this.prox_conta++, this.nome, nome);
      this.contas[ind_array++] = c;
    }
    return c;
  }

  public Conta buscaConta(int cod) {
    for (int i = 0; i < this.ind_array; i++) {
      if (this.contas[i].getCodigo() == cod) {
        return this.contas[i];
      }
    }
    return null;
  }
}
