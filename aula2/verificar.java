package aula2;

import java.util.Scanner;

public class verificar {
  public static void main(String[] args) {
    ExercVerificar verificar = new ExercVerificar();

    verificar.pegarNumero();
  }
}

class ExercVerificar {
  private Scanner ler = new Scanner(System.in);

  public void pegarNumero() {
    System.out.print("Digite um número: ");
    int numero = ler.nextInt();

    verificarDivisao(numero);
    ler.close();
  }

  private void verificarDivisao(int numero) {
    if ((numero % 3 != 0 && numero % 5 == 0) || (numero % 3 == 0 && numero % 5 != 0)) {
      if (numero % 3 == 0) {
        System.out.print("É divisível por 3");
      } else {
        System.out.print("É divisível por 5");
      }
    }
  }
}