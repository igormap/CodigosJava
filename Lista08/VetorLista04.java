import java.util.Scanner;

public class VetorLista04 {

  private int tamanho;
  private int[] vet;

  VetorLista04() {
    this.setTamanho(10);
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

  public void imprimeProdutoEscalar(VetorLista04 outro) {
    int i, j, mult;
    int res = 0;

    for (i = 0; i < this.getTamanho(); i++) {
        mult = this.getElemento(i) * outro.getElemento(i);
        res += mult; 
    }

    System.out.println(res);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    VetorLista04 vet1 = new VetorLista04();
    VetorLista04 vet2 = new VetorLista04();

    int i, el;
    for (i = 0; i < vet1.getTamanho(); i++) {
      el = scan.nextInt();
      vet1.setElemento(i, el);
    }

    for (i = 0; i < vet2.getTamanho(); i++) {
      el = scan.nextInt();
      vet2.setElemento(i, el);
    }

    vet1.imprimeProdutoEscalar(vet2);
  }
}
