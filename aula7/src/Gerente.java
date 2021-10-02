public class Gerente extends Empregado {
    private final Empregado[] subordinados;
    private Integer pos_subordinado = 0;

    public Gerente(String nome, String dataContratacao, Double salario) {
        super(nome,dataContratacao, salario);
        this.subordinados = new Empregado[3];
    }

    public void adicionaSubordinado(Empregado emp) {
        if (this.pos_subordinado < 3) {
            this.subordinados[this.pos_subordinado] = emp;
            this.pos_subordinado++;
        }
    }

    public void aumentaSalario(Double maisSalario) {
        for (int i = 0; i < this.pos_subordinado; i++) {
            this.subordinados[i].aumentaSalario(maisSalario);
        }
    }
}
