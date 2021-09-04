package aula4;

public class BlocoDeLembretes {
  private static Integer prox_bloco = 1;
  private Integer id;
  private Integer prox_lembrete;
  private Lembrete[] lembretes;
  private Integer max_lista;

  public BlocoDeLembretes() {
    this.id = prox_bloco++;
    this.prox_lembrete = 1;
    this.max_lista = 1;
    this.lembretes = new Lembrete[this.max_lista];
  }

  public static void main(String[] args) {
    BlocoDeLembretes b = new BlocoDeLembretes();
    Lembrete l =  new Lembrete("04/09/2021", "Reunião", "Discussão de projeto");
    Lembrete l2 =  new Lembrete("05/10/2021", "Reunião", "Discussão de projeto");
    b.incluirLembrete(l);
    b.incluirLembrete(l2);
    b.listarLembretes();
    b.removerLembrete(1);
    b.listarLembretes();
    b.buscarLembretesPorData("05/10/2021");
    b.buscarLembretesPorData("04/09/2021");
    b.buscarLembretesPorNome("uni");
    System.out.println(b.numeroDeLembretes());
  }

  public Integer getId() {
    return this.id;
  }
  public void setId(Integer id) { this.id = id; }

  public void setMax_lista(Integer max) {
    this.max_lista = max;
  }

  public void incluirLembrete(Lembrete l) {
    if (this.prox_lembrete.equals(this.max_lista + 1)) {
      this.setMax_lista(this.max_lista * 2);
      Lembrete[] lembretes = new Lembrete[this.max_lista];
      for (int i = 0; i < this.prox_lembrete - 1; i++) {
        lembretes[i] = this.lembretes[i];
      }
      this.lembretes = lembretes;
      System.out.println("Max range increased");
    }
    this.lembretes[this.prox_lembrete - 1] = l;
    this.prox_lembrete++;
  }

  public Integer numeroDeLembretes() {
    return this.prox_lembrete - 1;
  }

  public void removerLembrete(Integer id) {
    Lembrete[] lembretes = new Lembrete[this.max_lista];
    for (int i = 0, j = 0; i < this.prox_lembrete - 1; i++) {
      if ((i + 1) != id) {
        lembretes[j] = this.lembretes[i];
        j++;
      }
    }
    this.lembretes = lembretes;
    this.prox_lembrete--;
  }

  public void listarLembretes() {
    for (int i = 0; i < this.prox_lembrete - 1; i++) {
      this.lembretes[i].imprimiLembrete();
    }
  }

  public void buscarLembretesPorData(String data) {
    for (int i = 0; i < this.prox_lembrete - 1; i++) {
      if (this.lembretes[i].getData().equals(data)) {
        System.out.println("Found by date: ");
        this.lembretes[i].imprimiLembrete();
      }
    }
  }

  public void buscarLembretesPorNome(String nome) {
    for (int i = 0; i < this.prox_lembrete - 1; i++) {
      if (this.lembretes[i].getNome().contains(nome)) {
        System.out.println("Found by name: ");
        this.lembretes[i].imprimiLembrete();
      }
    }
  }
}
