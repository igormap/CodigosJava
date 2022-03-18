import java.util.Scanner;

public class VetorLista4 {

  public void fillVector() {
    Scanner scan = new Scanner(System.in);
    int vet1[] = new int[10];
    int i;

    for (i = 0; i < 10; i++) {
      vet1[i] = scan.nextInt();
    }

    for (i = 9; i >= 0; i--) {
        System.out.print(vet1[i] + " ");
    }
  }

  public static void main(String[] args) {
    VetorLista4 opt = new VetorLista4();

    opt.fillVector();
  }
}
