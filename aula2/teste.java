package aula2;

import java.util.Scanner;

public class teste {
  public static void main(String[] args) {
    ExercTeste teste = new ExercTeste();

    teste.pegarNumeros();
  }
}

class ExercTeste {
  private Scanner ler = new Scanner(System.in);

  private Integer numerosDigitados = 0;
  private Integer numerosPositivos = 0;
  private Integer numerosNegativos = 0;
  private Integer media = 0;
  private Integer soma = 0;
  private Integer maior = null;
  private Integer menor = null;

  public void pegarNumeros() {
    int numero = 0;
    while (numero != -1) {
      System.out.print("Digite um numero(Caso queira sair digite -1): ");
      numero = ler.nextInt();

      if (numero != -1) {
        this.numerosDigitados++;
        if (numero >= 0) {
          this.numerosPositivos++;
        } else {
          this.numerosNegativos++;
        }
        this.soma += numero;
        if (this.maior == null || this.maior < numero) {
          this.maior = numero;
        }
        if (this.menor == null || this.menor > numero) {
          this.menor = numero;
        }
      }
      if (this.numerosDigitados != 0) {
        this.media = this.soma / this.numerosDigitados;
      }
    }
    mostrarResultado();
    ler.close();
  }

  private void mostrarResultado() {
    int perPositivos = 0, perNegativos = 0;
    if (this.numerosDigitados != 0) {
      perPositivos = (100 * this.numerosPositivos) / this.numerosDigitados;
    }
    if (this.numerosDigitados != 0) {
      perNegativos = (100 * this.numerosNegativos) / this.numerosDigitados;
    }
    System.out.print("Soma dos números: " + this.soma);
    System.out.print("\nNúmeros digitados: " + this.numerosDigitados);
    System.out.print("\nMédia dos números digitados: " + this.media);
    System.out.print("\nPercentual de números positivos: " + perPositivos + "%");
    System.out.print("\nPercentual de números negativos: " + perNegativos + "%");
    if (this.maior != null) {
      System.out.print("\nMaior numero: " + this.maior);
    }
    if (this.menor != null) {
      System.out.print("\nMenor numero: " + this.menor);
    }
  }
}