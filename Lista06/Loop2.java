import java.util.Scanner;

public class Loop2 {

  private int number1, number2;

  public int getNumber1() {
    return this.number1;
  }

  public void setNumber1(int number1) {
    this.number1 = number1;
  }

  public int getNumber2() {
    return this.number2;
  }

  public void setNumber2(int number2) {
    this.number2 = number2;
  }

  public void imprimeNumeros() {
    int number1, number2;
    int i = 0;

    number1 = this.getNumber1();
    number2 = this.getNumber2();

    if (number1 > number2) {
      for (i = number1; i >= number2; i--) {
        System.out.println(i);
      }
    } else {
      for (i = number1; i <= number2; i++) {
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Loop2 objectLoop = new Loop2();

    int number1, number2;

    number1 = scanner.nextInt();
    number2 = scanner.nextInt();

    objectLoop.setNumber1(number1);
    objectLoop.setNumber2(number2);

    objectLoop.imprimeNumeros();
  }
}
