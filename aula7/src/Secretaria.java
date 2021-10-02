public class Secretaria extends Empregado {
    private final String[] contatoGerente;
    private Integer pos_contato = 0, ind_contato = 0;

    public Secretaria(String nome, String dataContratacao, Double salario) {
        super(nome, dataContratacao, salario);
        this.contatoGerente = new String[5];
    }

    public void adicionaContato(String nome) {
        if (this.pos_contato == 5) this.pos_contato = 0;
        if (this.ind_contato < 5) this.ind_contato++;

        this.contatoGerente[this.pos_contato] = nome;
        this.pos_contato++;
    }

    public void imprimiContato() {
        for (int i = 0; i < this.ind_contato; i++) {
            System.out.println(this.contatoGerente[i]);
        }
    }
}
