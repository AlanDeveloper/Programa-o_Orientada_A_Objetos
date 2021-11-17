import java.util.Comparator;
import java.util.Objects;

abstract class Carta {
    private final Integer ataque;
    private final String codigo, nome, descricao, tipo;
    private final Double decomposicao;
    private final Cor cor;

    public Carta(String codigo, String tipo, String nome, String descricao, String cor, Integer ataque, Double decomposicao) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
        this.ataque = ataque;
        this.decomposicao = decomposicao;
        this.cor = Cor.stringToCor(cor);
    }

    abstract Boolean ehReciclavel();

    @Override
    public String toString() {
        return "Carta{" +
                "codigo=" + codigo +
                ", ataque=" + ataque +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", decomposicao=" + decomposicao +
                ", cor='" + cor + '\'' +
                '}';
    }

    public Integer getAtaque() {
        return ataque;
    }

    public Double getDecomposicao() {
        return decomposicao;
    }

    public Cor getCor() { return cor; }

    public static AtaqueComparator compararAtaque() {
        return new AtaqueComparator();
    }

    public static DecomposicaoComparator compararDecomposicao() {
        return new DecomposicaoComparator();
    }

    public static ReciclavelComparator compararReciclavel() {
        return new ReciclavelComparator();
    }

    public static CorComparator compararCor() {
        return new CorComparator();
    }
}

class AtaqueComparator implements Comparator<Carta> {
    @Override
    public int compare(Carta o1, Carta o2) {
        if (Objects.equals(o1, null)) return 0;
        if (Objects.equals(o2, null)) return -3;
        return Integer.compare(o1.getAtaque(), o2.getAtaque()) * -1;
    }
}

class DecomposicaoComparator implements Comparator<Carta> {
    @Override
    public int compare(Carta o1, Carta o2) {
        if (Objects.equals(o1, null)) return -3;
        if (Objects.equals(o2, null)) return 0;
        return Double.compare(o1.getDecomposicao(), o2.getDecomposicao());
    }
}

class ReciclavelComparator implements Comparator<Carta> {
    @Override
    public int compare(Carta o1, Carta o2) {
        if (Objects.equals(o1, null)) return 0;
        if (Objects.equals(o2, null)) return -3;
        return Boolean.compare(o1.ehReciclavel(), o2.ehReciclavel()) * -1;
    }
}
class CorComparator implements Comparator<Carta> {
    @Override
    public int compare(Carta o1, Carta o2) {
        if (Objects.equals(o1, null)) return 0;
        if (Objects.equals(o2, null)) return -3;
        if (Objects.equals(o1.getCor(), Cor.VERDE) && (
                Objects.equals(o2.getCor(), Cor.MARROM) ||
                Objects.equals(o2.getCor(), Cor.CINZA) ||
                Objects.equals(o2.getCor(), Cor.PRETO) ||
                Objects.equals(o2.getCor(), Cor.BRANCO) ||
                Objects.equals(o2.getCor(), Cor.LARANJA)
                )) {
            return -3;
        } else if (Objects.equals(o1.getCor(), Cor.CINZA) && (
                Objects.equals(o2.getCor(), Cor.PRETO) ||
                Objects.equals(o2.getCor(), Cor.BRANCO) ||
                Objects.equals(o2.getCor(), Cor.LARANJA) ||
                Objects.equals(o2.getCor(), Cor.ROXO) ||
                Objects.equals(o2.getCor(), Cor.AZUL)
                )) {
            return -3;
        } else if (Objects.equals(o1.getCor(), Cor.LARANJA) && (
                Objects.equals(o2.getCor(), Cor.ROXO) ||
                Objects.equals(o2.getCor(), Cor.AZUL) ||
                Objects.equals(o2.getCor(), Cor.VERMELHO) ||
                Objects.equals(o2.getCor(), Cor.AMARELO) ||
                Objects.equals(o2.getCor(), Cor.VERDE)
                )) {
            return -3;
        } else if (Objects.equals(o1.getCor(), Cor.VERMELHO) && (
                Objects.equals(o2.getCor(), Cor.AMARELO) ||
                Objects.equals(o2.getCor(), Cor.VERDE) ||
                Objects.equals(o2.getCor(), Cor.MARROM) ||
                Objects.equals(o2.getCor(), Cor.CINZA) ||
                Objects.equals(o2.getCor(), Cor.PRETO)
                )) {
            return -3;
        } else if (Objects.equals(o1.getCor(), Cor.AZUL) && (
                Objects.equals(o2.getCor(), Cor.VERMELHO) ||
                Objects.equals(o2.getCor(), Cor.AMARELO) ||
                Objects.equals(o2.getCor(), Cor.VERDE) ||
                Objects.equals(o2.getCor(), Cor.MARROM) ||
                Objects.equals(o2.getCor(), Cor.CINZA)
                )) {
            return -3;
        } else if (Objects.equals(o1.getCor(), Cor.AMARELO) && (
                Objects.equals(o2.getCor(), Cor.VERDE) ||
                Objects.equals(o2.getCor(), Cor.MARROM) ||
                Objects.equals(o2.getCor(), Cor.CINZA) ||
                Objects.equals(o2.getCor(), Cor.PRETO) ||
                Objects.equals(o2.getCor(), Cor.BRANCO)
                )) {
            return -3;
        } else if (Objects.equals(o1.getCor(), Cor.MARROM) && (
                Objects.equals(o2.getCor(), Cor.CINZA) ||
                Objects.equals(o2.getCor(), Cor.PRETO) ||
                Objects.equals(o2.getCor(), Cor.BRANCO) ||
                Objects.equals(o2.getCor(), Cor.LARANJA) ||
                Objects.equals(o2.getCor(), Cor.ROXO)
                )) {
            return -3;
        } else if (Objects.equals(o1.getCor(), Cor.ROXO) && (
                Objects.equals(o2.getCor(), Cor.AZUL) ||
                Objects.equals(o2.getCor(), Cor.VERMELHO) ||
                Objects.equals(o2.getCor(), Cor.AMARELO) ||
                Objects.equals(o2.getCor(), Cor.VERDE) ||
                Objects.equals(o2.getCor(), Cor.MARROM)
                )) {
            return -3;
        } else if (Objects.equals(o1.getCor(), Cor.BRANCO) && (
                Objects.equals(o2.getCor(), Cor.LARANJA) ||
                Objects.equals(o2.getCor(), Cor.ROXO) ||
                Objects.equals(o2.getCor(), Cor.AZUL) ||
                Objects.equals(o2.getCor(), Cor.VERMELHO) ||
                Objects.equals(o2.getCor(), Cor.AMARELO)
                )) {
            return -3;
        } else if (Objects.equals(o1.getCor(), Cor.PRETO) && (
                Objects.equals(o2.getCor(), Cor.BRANCO) ||
                Objects.equals(o2.getCor(), Cor.LARANJA) ||
                Objects.equals(o2.getCor(), Cor.ROXO) ||
                Objects.equals(o2.getCor(), Cor.AZUL) ||
                Objects.equals(o2.getCor(), Cor.VERMELHO)
                )) {
            return -3;
        } else if (Objects.equals(o1.getCor(), Cor.MAIOR)) {
            if (o2.ehReciclavel()) return -3;
        } else if (Objects.equals(o1.getCor(), Cor.MENOR)) {
            if (!o2.ehReciclavel()) return -3;
        }
        return 0;
    }
}