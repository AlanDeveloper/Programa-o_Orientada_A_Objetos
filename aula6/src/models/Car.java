package models;

public class Car extends Automobile {
    private Integer qtdPortas;

    public Car(String marca, Integer qtdRodas, String modelo, Double potenciaMotor, Integer qtdPortas) {
        super(marca, qtdRodas, modelo, potenciaMotor);
        this.qtdPortas = qtdPortas;
    }

    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("N° de portas: " + this.qtdPortas);
    }
}
