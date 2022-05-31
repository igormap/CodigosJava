import java.util.Scanner;

public class Matriz {

  private int ordem;
  private int[][] mat;
  private int numLinhas;
  private int numColunas;

  //   Matriz() {
  //     this.setNumLinhas(5);
  //     this.setNumColunas(5);
  //     mat = new int[this.getNumLinhas()][this.getNumColunas()];
  //   }

  Matriz(int numLin, int numCol) {
    this.setNumLinhas(numLin);
    this.setNumColunas(numCol);
    mat = new int[this.getNumLinhas()][this.getNumColunas()];
  }

  public int getElemento(int indexL, int indexC) {
    return this.mat[indexL][indexC];
  }

  public void setElemento(int indexL, int indexC, int valor) {
    this.mat[indexL][indexC] = valor;
  }

  public int getNumLinhas() {
    return this.numLinhas;
  }

  public void setNumLinhas(int valor) {
    this.numLinhas = valor;
  }

  public int getNumColunas() {
    return this.numColunas;
  }

  public void setNumColunas(int valor) {
    this.numColunas = valor;
  }

  public void inicializa(Scanner scan) {
    int contLinhas, contColunas, el;

    for (contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++) {
      for (contColunas = 0; contColunas < this.getNumColunas(); contColunas++) {
        el = scan.nextInt();
        this.setElemento(contLinhas, contColunas, el);
      }
    }
  }

  public void somaMatriz() {
    int i, j;
    int sum = 0;

    for (i = 0; i < this.getNumLinhas(); i++) {
      for (j = 0; j < this.getNumColunas(); j++) {
        sum += this.getElemento(i, j);
      }
    }

    this.imprimeMatriz();
    System.out.printf("Soma: %d", sum);
  }

  public void imprimeMatriz() {
    int i, j;

    System.out.println("Matriz");
    for (i = 0; i < this.getNumLinhas(); i++) {
      for (j = 0; j < this.getNumColunas(); j++) {
        System.out.print(" " + this.getElemento(i, j));
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int ordem = scan.nextInt();
    Matriz mat = new Matriz(ordem, ordem);

    mat.inicializa(scan);
    mat.somaMatriz();
  }
}
