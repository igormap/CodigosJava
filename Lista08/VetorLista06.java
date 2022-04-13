import java.util.Scanner;

public class VetorLista06 {

  private int tamanho;
  private int[] vet;

  VetorLista06() {
    this.setTamanho(7);
    this.vet = new int[this.getTamanho()];
  }

  public int getTamanho() {
    return this.tamanho;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public int getElemento(int index) {
    return this.vet[index];
  }

  public void setElemento(int index, int el) {
    this.vet[index] = el;
  }

  public boolean isPrimo(int valor) {
    boolean primo = true;
    int i;

    if (valor > 1) {
      for (i = 2; i < valor; i++) {
        if (valor % i == 0) {
          primo = false;
        }
      }
    } else {
      primo = false;
    }

    return primo;
  }

  public void imprimePrimeiroPrimo() {
    int primo = -1;

    boolean achou = false;
    int i = 0;
    while (achou != true && i < this.getTamanho()) {
      if (isPrimo(this.getElemento(i))) {
        achou = true;
        primo = this.getElemento(i);
      }
      i++;
    }

   System.out.println(primo);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    VetorLista06 vetor = new VetorLista06();

    int i;
    for (i = 0; i < vetor.getTamanho(); i++) {
      int el = scan.nextInt();
      vetor.setElemento(i, el);
    }

    vetor.imprimePrimeiroPrimo();
  }
}
