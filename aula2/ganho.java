package aula2;

import java.util.Scanner;

public class ganho {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Double premio, g1, g2, g3;

    System.out.printf("Informe a quantia do prêmio: ");
    premio = ler.nextDouble();
    g1 = premio * 0.46;
    g2 = premio * 0.32;
    g3 = premio - (g1 + g2);

    System.out.println("------------------------");
    System.out.println("Quantia do primeiro colocado: " + g1);
    System.out.println("Quantia do segundo colocado: " + g2);
    System.out.println("Quantia do terceiro colocado: " + g3);
    System.out.println("------------------------");

    ler.close();
  }
}
