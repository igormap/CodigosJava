import java.util.Scanner;

public class VetorLista3 {

  public void fillVector() {
    Scanner scan = new Scanner(System.in);
    int vet1[] = new int[10];
    int vet2[] = new int[10];
    int i, mult;
    int res = 0;

    for (i = 0; i < 10; i++) {
      vet1[i] = scan.nextInt();
    }

    for (i = 0; i < 10; i++) {
      vet2[i] = scan.nextInt();
    }

    for (i = 0; i < 10; i++) {
      mult = vet1[i] * vet2[i];
      res += mult;
    }

    System.out.println(res);
  }

  public static void main(String[] args) {
    VetorLista3 opt = new VetorLista3();

    opt.fillVector();
  }
}
