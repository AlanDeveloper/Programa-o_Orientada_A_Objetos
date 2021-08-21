package aula2;

import java.util.Scanner;

public class diferenca {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Integer a, b;

    System.out.printf("Informe um número: ");
    a = ler.nextInt();
    System.out.printf("Informe um número: ");
    b = ler.nextInt();

    if (a > b || a == b) {
      System.out.println("------------------------");
      System.out.println("Resultado de a-b: " + (a - b));
      System.out.println("------------------------");
    } else {
      System.out.println("------------------------");
      System.out.println("Resultado de b-a: " + (b - a));
      System.out.println("------------------------");
    }

    ler.close();
  }
}
