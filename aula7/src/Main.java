public class Main {
    public static void main(String[] args) {
        Empregado emp = new Empregado("Alan", "02/10/2021", 2000.0);
        emp.aumentaSalario(500.0);
        emp.imprimir();
        Gerente gerente = new Gerente("Gabriel", "05/09/2021", 3000.0);
        gerente.imprimir();
        Secretaria secretaria = new Secretaria("Silvia", "25/09/2021", 2500.0);
        secretaria.imprimir();

        secretaria.adicionaContato("Alan");
        secretaria.imprimiContato();

        gerente.adicionaSubordinado(emp);
        gerente.adicionaSubordinado(secretaria);
        gerente.aumentaSalario(500.0);
        emp.imprimir();
        secretaria.imprimir();
    }
}
