import java.util.Scanner;

public class Loop3 {

  private int number;

  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void verificaNumeros() {
    int i;
    int number = this.getNumber();
    int count0_100 = 0;
    int count101_200 = 0;
    int count200 = 0;

    if (number > 200) {
      count0_100 = 99;
      count101_200 = 98;
      for (i = number; i > 200; i--) {
        count200++;
      }
    } else {
      if (number > 101 && number <= 200) {
        // O numero pertence ao intervalo 101 - 200
        count0_100 = 99;
        if (number != 200) {
          for (i = number; i > 101; i--) {
            count101_200++;
          }
        } else {
          count101_200 = 98;
        }
      } else {
        // Nesse caso, o numero pertence ao intervalo 0 - 100
        if (number != 100 && number != 101) {
          for (i = number; i > 0; i--) {
            count0_100++;
          }
        } else {
            count0_100 = 99;
        }
      }
    }

    System.out.println("Entre 0 e 100: " + count0_100);
    System.out.println("Entre 101 e 200: " + count101_200);
    System.out.println("Maior que 200: " + count200);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Loop3 objectLoop = new Loop3();

    int number = scan.nextInt();
    objectLoop.setNumber(number);

    objectLoop.verificaNumeros();
  }
}
