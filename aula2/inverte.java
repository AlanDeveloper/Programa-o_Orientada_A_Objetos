package aula2;

import java.util.Scanner;

public class inverte {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Integer numero, invertido = 0;

    System.out.printf("Informe um número inteiro, positivo e de três dígitos: ");
    numero = ler.nextInt();

    while (numero > 0) {
      invertido *= 10;
      invertido += (numero % 10);
      numero /= 10;
    }

    System.out.println("------------------------");
    System.out.println("Número invertido: " + invertido);
    System.out.println("------------------------");

    ler.close();
  }
}
