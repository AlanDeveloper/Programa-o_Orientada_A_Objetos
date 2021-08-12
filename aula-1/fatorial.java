public class fatorial {
  public static void main(String[] args) {
    int fatorial = 5, resultado = 1;

    for (; fatorial != 1; fatorial--) {
      resultado *= fatorial;
    }
    System.out.println(resultado);
  }
}
