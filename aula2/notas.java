package aula2;

import java.util.Scanner;

public class notas {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Double n1, n2, n3, media;

    System.out.printf("Informe sua nota 1: ");
    n1 = ler.nextDouble();
    System.out.printf("Informe sua nota 2: ");
    n2 = ler.nextDouble();
    System.out.printf("Informe sua nota 3: ");
    n3 = ler.nextDouble();
    media = (n1 + n2 + n3) / 3;

    if (media >= 7) {
      System.out.println("Aprovado com media: " + media);
    } else {
      System.out.println("Reprovado com media: " + media);
    }

    ler.close();
  }
}
