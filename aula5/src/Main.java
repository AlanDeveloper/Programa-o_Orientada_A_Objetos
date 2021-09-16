public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Bancos---------------");
        Banco b1 = new Banco("Picpay");
        System.out.println(b1.getCodigo() + " - " + b1.getNome());
        Banco b2 = new Banco("Nubank");
        System.out.println(b2.getCodigo() + " - " + b2.getNome());

        b1.criarConta("Alan", 1);
        b2.criarConta("Junior", 0);

        System.out.println("----------Contas bancárias----------");
        Conta c1 = b1.getConta(0);
        c1.fazerDebito(5000.0);
        System.out.println(c1.getCodigo() + " - " + c1.getNome() + " - R$" + c1.getSaldo());
        Conta c2 = b2.getConta(1);
        Conta c3 = b2.getConta(0);
        c3.fazerAplicacao(5000.0);
        System.out.println(c3.getCodigo() + " - " + c3.getNome() + " - R$" + c3.getSaldo());
        c3.fazerDebito(10000.0);
        System.out.println(c3.getCodigo() + " - " + c3.getNome() + " - R$" + c3.getSaldo());
    }
}
