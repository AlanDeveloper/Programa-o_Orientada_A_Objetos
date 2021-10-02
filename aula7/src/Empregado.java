import java.util.Calendar;

public class Empregado {
    protected Integer codigo;
    protected String nome;
    protected Calendar dataContratacao;
    protected Double salario;
    private static Integer prox_cod = 0;

    public Empregado(String nome, String dataContratacao, Double salario) {
        String[] data = dataContratacao.split("/");
        this.nome = nome;
        this.dataContratacao = Calendar.getInstance();
        this.dataContratacao.set(Integer.parseInt(data[2]), Integer.parseInt(data[1]), Integer.parseInt(data[0]));
        this.salario = salario;
        this.codigo = prox_cod++;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.getNome() + " | " + "Data de Contratação: " + this.formataData() + " | " + "Salário: " + this.getSalario());
    }

    public void aumentaSalario(Double maisSalario) {
        this.salario += maisSalario;
    }

    public String formataData() {
        String data =  this.dataContratacao.get(Calendar.DAY_OF_MONTH) + "/" + this.dataContratacao.get(Calendar.MONTH) + "/" + this.dataContratacao.get(Calendar.YEAR);
        return data;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        String[] data = dataContratacao.split("/");
        this.dataContratacao.set(Integer.parseInt(data[2]), Integer.parseInt(data[1]), Integer.parseInt(data[0]));
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
