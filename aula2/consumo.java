package aula2;

import java.util.Scanner;

public class consumo {
  public static void main(String[] args) {
    ExercConsumo con = new ExercConsumo();

    con.pegarKmELitros();
  }
}

class ExercConsumo {
  private Scanner ler = new Scanner(System.in);

  public void pegarKmELitros() {
    int km, litros;
    System.out.print("Km percorridos: ");
    km = ler.nextInt();
    System.out.print("Litros consumidos: ");
    litros = ler.nextInt();

    verificarConsumo(km, litros);
    ler.close();
  }

  private void verificarConsumo(int km, int litros) {
    int consumo = km / litros;
    if (consumo < 8) {
      System.out.print("Venda o carro!");
    } else if (consumo >= 8 && consumo < 14) {
      System.out.print("Econômico");
    } else {
      System.out.print("Super econômico");
    }
  }
}