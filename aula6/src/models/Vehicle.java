package models;

public class Vehicle {
    protected String marca;
    protected Integer qtdRodas;
    protected String modelo;
    protected Integer velocidade = 0;

    public Vehicle(String marca, Integer qtdRodas, String modelo) {
        this.marca = marca;
        this.qtdRodas = qtdRodas;
        this.modelo = modelo;
    }

    public void imprimirInformacoes() {
        System.out.println("Marca: " + this.marca + " | Modelo: " + this.modelo + " | N° de rodas: " + this.qtdRodas + " | Velocidade: " + this.velocidade);
    }

    public void acelerador(Integer maisVelocidade) {
        this.velocidade = this.velocidade + maisVelocidade;
    }

    public void frear(Integer menosVelocidade) {
        this.velocidade = this.velocidade - menosVelocidade;
        if (this.velocidade < 0) this.velocidade = 0;
    }
}
