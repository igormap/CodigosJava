import java.util.Scanner;

public class VetorLista03 {

  private int tamanho;
  private int[] vet;

  VetorLista03(int tamanho) {
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

  public void setVet(int[] vector) {
    this.vet = vector;
  }

  public void ImpressaoOrdenada() {
    int[] vet = this.getVet();
    int i;
    // vet.sort();

    for (i = 0; i < this.getTamanho(); i++) {
      int min = vet[i];
      int minId = i;

      for(int j = i+1; j < vet.length; j++) {
        if (vet[j] < min) {
          min = vet[j];
          minId = j;
        }
      }

      int temp = vet[i];
      vet[i] = min;
      vet[minId] = temp;
    }

    for (i = 0; i < this.getTamanho(); i++) {
        System.out.println(vet[i]);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    VetorLista03 aux;

    int tamanho = 6;
    int[] vet = new int[tamanho];
    aux = new VetorLista03(tamanho);

    int i;
    for (i = 0; i < tamanho; i++) {
      int el = scan.nextInt();
      vet[i] = el;
    }
    aux.setVet(vet);

    aux.ImpressaoOrdenada();
  }
}
