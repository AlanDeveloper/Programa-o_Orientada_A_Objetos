package models;

public class Automobile extends Vehicle {
    protected Double potenciaMotor;

    public Automobile(String marca, Integer qtdRodas, String modelo, Double potenciaMotor) {
        super(marca, qtdRodas, modelo);
        this.potenciaMotor = potenciaMotor;
    }

    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Potência do motor: " + this.potenciaMotor);
    }

    public String getModelo() {
        return this.modelo;
    }
}
