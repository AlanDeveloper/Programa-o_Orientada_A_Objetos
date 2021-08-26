package aula3;

import aula3.SistemaBancario.*;

public class exercBanco {
  public static void main(String[] args) {
    Banco itau = new Banco("Itau");
    Conta b, maria = itau.criaConta("Maria");
    System.out.println(itau.getCodigo());
    System.out.println(itau.getNome());
    b = itau.buscaConta(1);
    b = itau.buscaConta(2);
    Banco bb = new Banco("Banco do Brasil");
    Conta jose = bb.criaConta("Jose");
    System.out.println(jose.getNome());
    System.out.println(jose.getCodigo());
    System.out.println(jose.getSaldo());
    jose.efetuarAplicacao(100.0F);
    jose.efetuarDebito(30.5F);
    System.out.println(jose.getSaldo());
  }
}