import models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nVehicle");
        Vehicle v1 = new Vehicle("Ford", 4, "NPX");
        v1.imprimirInformacoes();
        v1.acelerador(50);
        v1.frear(20);
        v1.imprimirInformacoes();

        System.out.println("\nBicycle");
        Bicycle b1 = new Bicycle("Ford", 4, "NPX", 5, true);
        b1.imprimirInformacoes();
        b1.acelerador(20);
        b1.imprimirInformacoes();

        System.out.println("\nAutomobile");
        Automobile a1 = new Automobile("Ford", 4, "NPX", 2.5);
        a1.imprimirInformacoes();

        System.out.println("\nMotorcycle");
        Motorcycle m1 = new Motorcycle("Ford", 4, "NPX", 2.0, true);
        m1.imprimirInformacoes();

        System.out.println("\nCar");
        Car c1 = new Car("Ford", 4, "NPX", 2.0, 5);
        c1.imprimirInformacoes();

        System.out.println("\nCadastro de veículos");
        CadastroDeVeiculos cv = new CadastroDeVeiculos(1);
        cv.tamanho();
        cv.imprimir();
        cv.inserir(new Automobile("Ford", 4, "NPX", 2.0));
        cv.tamanho();
        cv.imprimir();

        System.out.println("\n\n");
        cv.inserir(new Automobile("Toyota", 4, "APX", 2.0));
        cv.ordenar();
        cv.imprimir();
    }
}
