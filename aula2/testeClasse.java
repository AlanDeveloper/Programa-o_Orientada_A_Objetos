package aula2;

public class testeClasse {
  public static void main(String[] args) {
    Funcionario func1 = new Funcionario("Alan", "Tecnologia", 2000.00, "17/08/2021", "444444444444");
    func1.info();
    func1.aumentaSalario(500.00);
    func1.calculaGanhoAnual();
  }
}

class Funcionario {
  private String nome;
  private String departamento;
  private Double salario;
  private String dtEntrada;
  private String rg;

  public Funcionario(String nome, String departamento, Double salario, String dtEntrada, String rg) {
    this.nome = nome;
    this.departamento = departamento;
    this.salario = salario;
    this.dtEntrada = dtEntrada;
    this.rg = rg;
  }

  public void info() {
    System.out.println("------------------------");
    System.out.println("\nNome: " + this.nome);
    System.out.println("\nDepartamento: " + this.departamento);
    System.out.println("\nSalário: " + this.salario);
    System.out.println("\nData de entrada: " + this.dtEntrada);
    System.out.println("\nRG: " + this.rg);
    System.out.println("------------------------");
  }

  public void aumentaSalario(Double qtd) {
    this.salario += qtd;
    System.out.println("Novo salário: " + this.salario);
  }

  public void calculaGanhoAnual() {
    System.out.println("Ganho anual: " + this.salario * 12);
  }
}