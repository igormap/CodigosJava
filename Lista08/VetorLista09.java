import java.util.Scanner;

public class Vetor {

  private int tamanho;
  private int[] vet;

  Vetor() {
    this.setTamanho(5);
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

  
  public void inicializa(Scanner scan) {
    int i;

    for(i = 0; i < this.getTamanho(); i++) {
        this.vet[i] = scan.nextInt();
    }
  }

  public void intercalaVetores(Vetor outro) {
      int i;
      for (i = 0; i < this.getTamanho(); i++) {
          System.out.print(this.getElemento(i) + " ");
          System.out.print(outro.getElemento(i) + " ");
      }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Vetor vet1 = new Vetor();
    Vetor vet2 = new Vetor();

    vet1.inicializa(scan);
    vet2.inicializa(scan);

    vet1.intercalaVetores(vet2);
  }

}