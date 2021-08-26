package aula3.SistemaBancario;

public class Conta {
  private Integer id;
  private float saldo;
  private String nome;
  private String nomeBanco;

  public Conta(Integer id, String nomeBanco, String nome) {
    this.id = id;
    this.nomeBanco = nomeBanco;
    this.nome = nome;
    this.saldo = 0F;
  }

  public String getNome() {
    return this.nome;
  }

  public Integer getCodigo() {
    return this.id;
  }

  public String getNomeBanco() {
    return this.nomeBanco;
  }

  public Float getSaldo() {
    return this.saldo;
  }

  public void efetuarDebito(Float novoSaldo) {
    this.saldo -= novoSaldo;
  }

  public void efetuarAplicacao(Float novoSaldo) {
    this.saldo += novoSaldo;
  }
}