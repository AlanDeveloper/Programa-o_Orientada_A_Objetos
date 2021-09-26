import models.Automobile;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class CadastroDeVeiculos {
    private Automobile[] automobiles;
    private Integer nAutomobiles, indAutomobiles = 0;

    public CadastroDeVeiculos(Integer nAutomobiles) {
        this.nAutomobiles = nAutomobiles;
        this.automobiles = new Automobile[this.nAutomobiles];
    }

    public void aumenta() {
        Automobile[] novo = new Automobile[this.nAutomobiles * 2];
        System.arraycopy(this.automobiles, 0, novo, 0, this.nAutomobiles);
        this.nAutomobiles *= this.nAutomobiles;
        this.automobiles = novo;
    }

    public void inserir(Automobile automobile) {
        if (Objects.equals(this.nAutomobiles, this.indAutomobiles)) {
            this.aumenta();
        }
        this.automobiles[this.indAutomobiles] = automobile;
        this.indAutomobiles++;
    }

    public Automobile retornaItem(Integer posicao) {
        if (posicao < this.indAutomobiles && posicao >= 0) {
            return this.automobiles[posicao];
        } else {
            System.out.println("Veículo não encontrado!");
            return null;
        }
    }

    public void tamanho() {
        System.out.println("N° de veículos: " + this.indAutomobiles);
    }

    public void imprimir() {
        for (int i = 0; i < this.indAutomobiles; i++) {
            System.out.println("Registro do carro n° " + (i + 1) + ":");
            this.automobiles[i].imprimirInformacoes();
        }
    }

    public void ordenar() {
        Arrays.sort(this.automobiles, Comparator.comparing(Automobile::getModelo));
    }
}
