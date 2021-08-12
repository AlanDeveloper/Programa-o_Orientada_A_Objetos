public class nota {
  public static void main(String[] args) {
    double nota1 = 8, nota2 = 5, media, mediaPonderada;

    media = (nota1 + nota2) / 2;
    mediaPonderada = (nota1 * 2 + nota2 * 3) / 5;
    System.out.println("Média: " + media + "\nMédia ponderada: " + mediaPonderada);
  }
}