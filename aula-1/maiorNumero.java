public class maiorNumero {
  public static void main(String[] args) {

    int numero1 = 8, numero2 = -5, numero3 = 5;

    if (numero1 < numero2) {
      if (numero1 < numero3) {
        System.out.println("Menor número: " + numero1);
      } else {
        System.out.println("Menor número: " + numero3);
      }
    } else {
      if (numero2 < numero3) {
        System.out.println("Menor número: " + numero2);
      } else {
        System.out.println("Menor número: " + numero3);
      }
    }

    System.out.println("Números positivos: ");
    if (numero1 >= 0) {
      System.out.println(numero1);
    }
    if (numero2 >= 0) {
      System.out.println(numero2);
    }
    if (numero3 >= 0) {
      System.out.println(numero3);
    }
  }
}
