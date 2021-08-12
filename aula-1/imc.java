public class imc {
  public static void main(String[] args) {
    int peso = 60;
    double altura = 1.8, imc;
    imc = peso / (altura * altura);

    if (imc < 20) {
      System.out.println("Magro");
    } else if (imc >= 20 && imc < 25) {
      System.out.println("Normal");
    } else if (imc >= 25 && imc < 29) {
      System.out.println("Acima do peso");
    } else if (imc >= 29 && imc < 30) {
      System.out.println("Obeso");
    } else {
      System.out.println("Muito obeso");
    }
  }
}