// Poder de compra
// Você foi contratado por uma loja de roupas que oferece um desconto de 5% para quem faz compras acima de R$ 200,00. Escreva um programa que recebe o valor da compra total e o saldo que o cliente tem, ao final você deve imprimir o valor da compra já com o desconto e se o cliente tem condições de pagar ou não essa compra.

// Dicas
// Crie uma classe Compra.
// Sua classe deverá ter apenas dois atibutos do tipo float.
// Faça todos os métodos de acesso/modificação.
// Não se prenda somente aos exemplos mostrados.
// Qualquer dúvida entre em contato com os monitores.

import java.util.Scanner;

public class Compra {

  private float valorTotal;
  private float saldo;

  public float getValorTotal() {
    return this.valorTotal;
  }

  public void setValorTotal(float valorTotal) {
    this.valorTotal = valorTotal;
  }

  public float getSaldo() {
    return this.saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public void calculaDesconto() {
    float valorTotal;
    float desconto;

    valorTotal = this.getValorTotal();

    if (valorTotal > 200) {
      desconto = ((float) 5 / 100) * valorTotal;
      valorTotal = valorTotal - desconto;
    }
    this.setValorTotal(valorTotal);
  }

  public void imprimeCompra() {
    float valorTotal;
    float saldo;

    valorTotal = this.getValorTotal();
    saldo = this.getSaldo();

    if (saldo >= valorTotal) {
      System.out.printf(
        "Valor final da compra %.2f, O cliente tem saldo suficiente!!\n",
        valorTotal
      );
    } else {
      System.out.printf(
        "Valor final da compra %.2f, O cliente nao tem saldo suficiente!!\n",
        valorTotal
      );
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Compra objOperator = new Compra();

    float valorTotal;
    float saldo;

    valorTotal = scan.nextFloat();
    saldo = scan.nextFloat();

    objOperator.setValorTotal(valorTotal);
    objOperator.setSaldo(saldo);

    objOperator.calculaDesconto();
    objOperator.imprimeCompra();
  }
}
