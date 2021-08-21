package aula2;

import java.util.Scanner;

public class bissexto {
  public static void main(String[] args) {
    ExercBissexto bis = new ExercBissexto();

    bis.pegarAno();
  }
}

class ExercBissexto {
  private Scanner ler = new Scanner(System.in);

  public void pegarAno() {
    System.out.print("Digite a seguir o número a ser invertido: ");
    int ano = ler.nextInt();

    verificarAno(ano);
    ler.close();
  }

  private void verificarAno(int ano) {
    if ((ano % 4 == 0 || ano % 400 == 0) && ano % 100 != 0) {
      System.out.print("É um ano bissexto");
    } else {
      System.out.print("Não é um ano bissexto");
    }
  }
}