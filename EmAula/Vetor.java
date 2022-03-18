import java.util.Random;
import java.util.Scanner;

public class Vetor {

  private int[] vet;
  private int tamanho;

  Vetor() {
    this.setTamanho(10);
    vet = new int[this.getTamanho()];
  }

  Vetor(int tamanhoInicio) {
    this.setTamanho(tamanhoInicio);
    vet = new int[this.getTamanho()];
  }

  public int getElemento(int index) {
    return this.vet[index];
  }

  public void setElemento(int index, int valor) {
    this.vet[index] = valor;
  }

  public int getTamanho() {
    return this.tamanho;
  }

  public void setTamanho(int valor) {
    this.tamanho = valor;
  }

  public void inicializa(int valor) {
    int cont;
    for (cont = 0; cont < this.getTamanho(); cont++) {
      this.setElemento(cont, valor);
    }
  }

  public void inicializaManual() {
    int cont, valor;
    Scanner ler = new Scanner(System.in);

    for (cont = 0; cont < this.getTamanho(); cont++) {
      valor = ler.nextInt();
      this.setElemento(cont, valor);
    }
  }

  public void inicializaRandomico() {
    int cont, valor;
    Random gerador = new Random();

    for (cont = 0; cont < this.getTamanho(); cont++) {
      valor = gerador.nextInt(this.getTamanho() * 2);
      this.setElemento(cont, valor);
    }
  }

  public void imprime() {
    int cont;
    for (cont = 0; cont < this.getTamanho(); cont++) {
      System.out.print(" " + this.getElemento(cont));
    }
    System.out.println();
  }

  public static void main(String args[]) {
    Vetor rua1, rua2;
    int cont;

    rua1 = new Vetor();
    rua2 = new Vetor(5);

    rua1.inicializa(4);
    // rua1.inicializaManual();
    rua2.inicializaRandomico();

    rua1.imprime();
    rua2.imprime();
  }
}
