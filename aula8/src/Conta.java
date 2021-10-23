public class Conta {
    private Integer codigo, codigoBanco, tipo; // 0 = corrente | 1 = poupança
    private String nome;
    private Double saldo;
    private static Integer prox_conta = 0;

    public Conta(Integer codigoBanco, String nome, Integer tipo) {
        this.codigoBanco = codigoBanco;
        this.nome = nome;
        this.saldo = 0.0;
        this.tipo = tipo;
        this.codigo = prox_conta++;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Integer codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void fazerAplicacao(Double saldo) {
        this.saldo += saldo;
    }

    public void fazerDebito(Double saldo) {
        try {
            if (saldo < 0) {
                throw new IllegalArgumentException();
            }
            double s = this.saldo - saldo;
            if (this.tipo == 1 && s <= 0) {
                this.saldo = 0.0;
            } else {
                this.saldo -= saldo;
            }
        } catch (IllegalArgumentException erro) {
            System.out.println("Valor negativo passado!");
        }
    }
}
