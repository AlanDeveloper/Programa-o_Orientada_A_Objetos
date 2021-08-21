package aula2;

import java.util.Scanner;

public class multiplo {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Integer x, y, maior, menor;

    System.out.printf("Informe X: ");
    x = ler.nextInt();
    System.out.printf("Informe Y: ");
    y = ler.nextInt();

    if (x > y) {
      maior = x;
      menor = y;
    } else {
      maior = y;
      menor = x;
    }

    if (maior % menor == 0) {
      System.out.println("------------------------");
      System.out.println("X é multiplo de Y");
      System.out.println("------------------------");
    } else {
      System.out.println("------------------------");
      System.out.println("X não é multiplo de Y");
      System.out.println("------------------------");
    }

    ler.close();
  }
}
