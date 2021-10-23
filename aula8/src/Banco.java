import java.util.Objects;

public class Banco {
    private Integer codigo, max_contas, pos_contas;
    private String nome;
    private Conta[] contas;
    private static Integer prox_banco = 0;

    public Banco(String nome) {
        this.codigo = prox_banco++;
        this.nome = nome;
        this.max_contas = 5;
        this.pos_contas = 0;
        this.contas =  new Conta[this.max_contas];
    }

    private void maisContas() {
        Conta[] novo = new Conta[this.max_contas + 5];
        if (this.max_contas >= 0) System.arraycopy(this.contas, 0, novo, 0, this.max_contas);
        this.max_contas += 5;
        this.contas = novo;
    }

    public void criarConta(String nome, Integer tipo) {
        if (Objects.equals(this.max_contas, this.pos_contas)) {
            this.maisContas();
        }
        Conta c = new Conta(this.codigo, nome, tipo);
        this.contas[this.pos_contas] = c;
        this.pos_contas++;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta(Integer codigo) {
        if (this.contas[codigo] != null) {
            return this.contas[codigo];
        } else {
            System.out.println("Conta não encontrada");
            return null;
        }
    }
}
