import java.util.ArrayList;

public class Jogador {
    private final String nome;
    private final ArrayList<Carta> cartas;

    public Jogador(String nome) {
        this.nome = nome;
        this.cartas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Integer numeroDeCartas() {
        return cartas.size();
    }

    public void incluir(Carta c) {
        this.cartas.add(c);
    }

    public Carta excluir() {
        Carta carta = this.cartas.get(0);
        this.cartas.remove(0);
        return carta;
    }

    public Boolean temCartas() {
        return cartas.size() > 0;
    }
}
