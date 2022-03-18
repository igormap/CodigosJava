import java.util.Scanner;

public class ValorDeE {

  private int n;
  private float e;

  public int getN() {
    return this.n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public float getE() {
    return this.e;
  }

  public void setE(float e) {
    this.e = e;
  }

  public void calculaE() {
    int i, j, fat;
    int n = this.getN();
    float e = 1;
    
    for (i = 1; i <= n; i++) {
        fat = 1;
        for(j = i; j > 0; j--) {
            fat *= j;
        }
        e += (float) 1 / fat;
    }
    
    this.setE(e);
    System.out.printf("Valor de E: %.8f", this.getE());
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ValorDeE objectLoop = new ValorDeE();

    int number = scan.nextInt();
    objectLoop.setN(number);

    objectLoop.calculaE();
  }
}
