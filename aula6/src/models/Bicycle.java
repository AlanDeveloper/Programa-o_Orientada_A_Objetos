package models;

public class Bicycle extends Vehicle {
    private Integer numMarchas;
    private Boolean bagageiro;

    public Bicycle(String marca, Integer qtdRodas, String modelo, Integer numMarchas, Boolean bagageiro) {
        super(marca, qtdRodas, modelo);
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
    }

    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("N° de marchas: " + this.numMarchas + " | Bagageiro: " + (this.bagageiro ? "Possui" : "Não possui"));
    }
}
