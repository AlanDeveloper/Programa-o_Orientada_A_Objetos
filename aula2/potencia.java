package aula2;

import java.util.Scanner;

public class potencia {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Double a, b;

    System.out.printf("Informe a base da potenciação: ");
    a = ler.nextDouble();
    System.out.printf("Informe o expoente: ");
    b = ler.nextDouble();

    System.out.println("------------------------");
    System.out.println("Resultado de a^b: " + Math.pow(a, b));
    System.out.println("------------------------");

    ler.close();
  }
}
