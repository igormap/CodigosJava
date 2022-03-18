import java.util.Scanner;

public class VetorLista2 {

  public void fillVector() {
    Scanner scan = new Scanner(System.in);
    int vet1[] = new int[5];
    int vet2[] = new int[5];
    int results[] = new int[5];
    int i;
    int res = 0;

    for(i = 0; i < 5; i++) {
        vet1[i] = scan.nextInt();
    }

    for(i = 0; i < 5; i++) {
        vet2[i] = scan.nextInt();
    }

    for (i = 0; i < 5; i++) {
        res = vet1[i] + vet2[i];
        results[i] = res;
    }

    for (i = 0; i < 5; i++) {
        System.out.print(results[i] + " ");
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    VetorLista2 opt = new VetorLista2();

    opt.fillVector();
  }
}
