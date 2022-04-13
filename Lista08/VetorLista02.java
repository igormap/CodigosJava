import java.util.Scanner;

public class VetorLista02 {

  private int tamanho;
  private int[] vet;

  VetorLista02(int tamanho) {
    this.tamanho = tamanho;
    this.vet = new int[tamanho];
  }

  public int getTamanho() {
    return tamanho;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public int[] getVet() {
    return this.vet;
  }

  public void setVet(int[] vetor) {
    this.vet = vetor;
  }

  public void Maior() {
    int[] vet = this.getVet();
    int i;

    for (i = 0; i < this.getTamanho(); i++) {
      if (vet[i] > 50) {
        System.out.println(vet[i]);
      }
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    VetorLista02 aux;

    int tamanho = 5;
    int[] vet = new int[tamanho];
    aux = new VetorLista02(tamanho);

    int i;
    for (i = 0; i < tamanho; i++) {
      int el = scan.nextInt();
      vet[i] = el;
    }
    aux.setVet(vet);

    aux.Maior();
  }
}
