public class Matriz {

  private int[][] mat;
  private int numLinhas;
  private int numColunas;

  Matriz() {
    this.setNumLinhas(5);
    this.setNumColunas(5);
    mat = new int[this.getNumLinhas()][this.getNumColunas()];
  }

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

  public void imprime() {
    int contLinhas, contColunas;
    for (contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++) {
      for (contColunas = 0; contColunas < this.getNumColunas(); contColunas++) {
        System.out.print(" " + this.getElemento(contLinhas, contColunas));
      }
      System.out.println();
    }
  }

  public void inicializaRandomico() {
    Random gerador = new Random();
    int contLinhas, contColunas, valor;
    for (contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++) {
      for (contColunas = 0; contColunas < this.getNumColunas(); contColunas++) {
        valor = gerador.nextInt(this.getNumLinhas() + this.getNumColunas() * 2);
        this.setElemento(contLinhas, contColunas, valor);
      }
    }
  }

  public void inicializa(int valor) {
    Random gerador = new Random();
    int contLinhas, contColunas;
    for (contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++) {
      for (contColunas = 0; contColunas < this.getNumColunas(); contColunas++) {
        this.setElemento(contLinhas, contColunas, valor);
      }
    }
  }

  public void imprime() {
    int contLinhas, contColunas;
    for (contLinhas = 0; contLinhas < this.getNumLinhas(); contLinhas++) {
      for (contColunas = 0; contColunas < this.getNumColunas(); contColunas++) {
        System.out.print(" " + this.getElemento(contLinhas, contColunas));
      }
      System.out.println();
    }
  }

  public boolean busca(int chave) {
    boolean resposta;
    int contLinhas, contColunas;

    resposta = false;
    contLinhas = 0;
    while ((contLinhas < this.getNumLinhas()) && !resposta) {
      contColunas = 0;
      while ((contColunas < this.getNumColunas()) && !resposta) {
        if (chave == this.getElemento(contLinhas, contColunas)) {
          resposta = true;
        }
        contColunas++;
      }
      contLinhas++;
    }
    return resposta;
  }

  private void troca(int indexi1, int indexj1, int indexi2, int indexj2) {
    int temp;
    temp = this.getElemento(indexi1, indexj1);
    this.setElemento(indexi1, indexj1, this.getElemento(indexi2, indexj2));
    this.setElemento(indexi2, indexj2, temp);
  }
}
