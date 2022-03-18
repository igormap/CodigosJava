import java.util.Scanner;

public class Tabuada {

  private int number;

  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void imprimeCalculo() {
    int number = this.getNumber();
    int i = 0;
    int j = number;
    int termo = 0; 

    for(i = 0; i <= number; i++) {
        termo = j * i;
        System.out.printf("%d x %d = %d\n", j, i, termo);
    }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Tabuada objectLoop = new Tabuada();

    int number;

    number = scanner.nextInt();

    objectLoop.setNumber(number);

    objectLoop.imprimeCalculo();
  }
}
