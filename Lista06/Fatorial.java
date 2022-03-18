import java.util.Scanner;

public class Fatorial {

  private int number;

  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void imprimeCalculo() {
    int number;
    int i = 0;
    int fat = 1;

    number = this.getNumber();

    for(i = number; i > 0; i--) {
        fat *= i;
    }

    System.out.printf("Fatorial de %d: %d", number, fat);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Fatorial objectLoop = new Fatorial();

    int number;

    number = scanner.nextInt();

    objectLoop.setNumber(number);

    objectLoop.imprimeCalculo();
  }
}
