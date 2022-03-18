import java.util.Scanner;

public class VetorLista1 {

  public void fillVector(int leng) {
    int vet[] = new int[leng];
    int i;
    int el = 0;
    int par = 0;
    int impar = 0;

    for(i = 1; i <= leng; i++) {
        el = i % 2;
        if (el == 0) {
            par++;
        }
        else {
            impar++;
        }
    }

    System.out.println("pares: " + par);
    System.out.println("impares: " + impar);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    VetorLista1 opt = new VetorLista1();

    int leng = scan.nextInt();

    opt.fillVector(leng);
  }
}
