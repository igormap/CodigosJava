import java.util.Scanner;

public class Vetor {

  private int tamanho;
  private int[] vet;

  Vetor() {
    this.setTamanho(15);
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

  public void imprimeEnderecoMaiorMenor() {
    int i;
    int posMaior = 0;
    int posMenor = 0;

    for (i = 0; i < this.getTamanho(); i++) {
        if(vet[i] > vet[posMaior]) {
            posMaior = i;
        }
        else {
            if(vet[i] < vet[posMenor]) {
                posMenor = i;
            }
        }
    }

    System.out.println("maior: " + posMaior);
    System.out.println("menor: " + posMenor);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Vetor vet = new Vetor();

    int i, el;
    for (i = 0; i < vet.getTamanho(); i++) {
      el = scan.nextInt();
      vet.setElemento(i, el);
    }

    vet.imprimeEnderecoMaiorMenor();
  }

}