package models;

public class Motorcycle extends Automobile {
    private Boolean partidaEletrica;

    public Motorcycle(String marca, Integer qtdRodas, String modelo, Double potenciaMotor, Boolean partidaEletrica) {
        super(marca, qtdRodas, modelo, potenciaMotor);
        this.partidaEletrica = partidaEletrica;
    }

    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Partida elétrica: " + (this.partidaEletrica ? "Ligado" : "Desligado"));
    }
}
