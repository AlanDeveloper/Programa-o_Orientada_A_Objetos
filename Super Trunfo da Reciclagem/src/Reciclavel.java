public class Reciclavel extends Carta {

    public Reciclavel(String codigo, String tipo, String nome, String descricao, String cor, Integer ataque, Double decomposicao) {
        super(codigo, tipo, nome, descricao, cor, ataque, decomposicao);
    }

    @Override
    public Boolean ehReciclavel() {
        return true;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return str.substring(0, str.length() - 1) + ", reciclável='sim'}";
    }
}
