import java.util.Scanner;

public class Tabuada2 {

  private int n;
  private int q;

  public int getN() {
    return this.n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public int getQ() {
    return this.q;
  }

  public void setQ(int q) {
    this.q = q;
  }

  public void processaTabuada() {
    int n = this.getN();
    int q = this.getQ();
    int i, j, k;
    int mult = 1;

    System.out.print(" |");
    for (i = n; i <= q; i++) {
        System.out.print("  " + i );
    }
    System.out.print("\n\n");
    for(j = n; j <=q; j++) {
        System.out.printf("%d| ", j);
        for(k = n; k <= q; k++) {
            mult = j * k;
            System.out.printf("%02d ", mult);
        }
        System.out.print("\n");
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Tabuada2 opt = new Tabuada2();

    int n = scan.nextInt();
    int q = scan.nextInt();
    opt.setN(n);
    opt.setQ(q);

    opt.processaTabuada();
  }
}
