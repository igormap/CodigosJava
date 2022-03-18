import java.util.Scanner;

public class VetorLista5 {

  public void fillVector() {
    Scanner scan = new Scanner(System.in);
    int vet[] = new int[15];
    int i, maior, menor, posMenor, posMaior;

    for (i = 0; i < 15; i++) {
      vet[i] = scan.nextInt();
    }

    maior = vet[0];
    menor = vet[0];
    posMenor = 0;
    posMaior = 0;
    for (i = 1; i < 15; i++) {
      if (vet[i] > maior) {
        maior = vet[i];
        posMaior = i;
      } else {
        if (vet[i] < menor) {
          menor = vet[i];
          posMenor = i;
        }
      }
    }

    System.out.println("maior: " + posMaior);
    System.out.println("menor: " + posMenor);
  }

  public static void main(String[] args) {
    VetorLista5 opt = new VetorLista5();

    opt.fillVector();
  }
}
