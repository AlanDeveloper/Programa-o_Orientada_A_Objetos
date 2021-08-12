public class primo {
  public static void main(String[] args) {
    int primo = 15;

    if ((primo % 2 == 0 || primo % 3 == 0) && (primo != 2 && primo != 3)) {
      System.out.println("Não é primo");
    } else {
      System.out.println("É primo");
    }
  }
}
