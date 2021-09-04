package aula4;

public class Lembrete {
  private static Integer prox_lembrete = 1;
  private Integer id;
  private String data;
  private String nome;
  private String descricao;

  public Lembrete(String data, String nome, String descricao) {
    this.id = prox_lembrete++;
    this.data = data;
    this.nome = nome;
    this.descricao = descricao;
  }

  public Integer getId() {
    return this.id;
  }

  public String getData() {
    return this.data;
  }

  public String getNome() {
    return this.nome;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void imprimiLembrete() {
    System.out.println(this.id + " " + this.data + " " + this.nome + " " + this.descricao);
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setData(String data) {
    this.data = data;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
