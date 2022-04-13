import java.util.Scanner;

public class Matriz01 {

  private int ordem;
  private int[][] mat;
  private int numLinhas;
  private int numColunas;

//   Matriz01() {
//     this.setNumLinhas(5);
//     this.setNumColunas(5);
//     mat = new int[this.getNumLinhas()][this.getNumColunas()];
//   }

  Matriz01(int numLin, int numCol) {
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

  public void somaMatriz() {}

  public void imprimeMatriz() {}

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int ordem = scanner.nextInt();
    Matriz01 mat = new Matriz01(ordem, ordem);
  }
}
