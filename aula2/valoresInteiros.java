package aula2;

import java.util.Scanner;

public class valoresInteiros {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Integer n1, n2, n3, n4, n5, soma, media, menor, maior;

    System.out.printf("Informe um número inteiro e positivo: ");
    n1 = ler.nextInt();
    System.out.printf("Informe um número inteiro e positivo: ");
    n2 = ler.nextInt();
    System.out.printf("Informe um número inteiro e positivo: ");
    n3 = ler.nextInt();
    System.out.printf("Informe um número inteiro e positivo: ");
    n4 = ler.nextInt();
    System.out.printf("Informe um número inteiro e positivo: ");
    n5 = ler.nextInt();

    soma = n1 + n2 + n3 + n4 + n5;
    media = soma / 5;

    if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
      maior = n1;
    } else if (n2 > n3 && n2 > n4 && n2 > n5) {
      maior = n2;
    } else if (n3 > n4 && n3 > n5) {
      maior = n3;
    } else if (n4 > n5) {
      maior = n4;
    } else {
      maior = n5;
    }

    if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
      menor = n1;
    } else if (n2 < n3 && n2 < n4 && n2 < n5) {
      menor = n2;
    } else if (n3 < n4 && n3 < n5) {
      menor = n3;
    } else if (n4 < n5) {
      menor = n4;
    } else {
      menor = n5;
    }

    System.out.println("\n---------RESULTADO---------");
    System.out.println("Soma: " + soma);
    System.out.println("Média: " + media);
    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);

    ler.close();
  }
}
