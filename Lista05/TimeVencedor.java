import java.util.Scanner;

public class TimeVencedor {

  private String timeA;
  private String timeB;
  private String vencedor;
  private int golsTimeA;
  private int golsTimeB;

  public TimeVencedor(
    String timeA,
    String timeB,
    int golsTimeA,
    int golsTimeB
  ) {
    this.timeA = timeA;
    this.timeB = timeB;
    this.golsTimeA = golsTimeA;
    this.golsTimeB = golsTimeB;
  }

  // métodos de acesso timeA
  public String getTimeA() {
    return this.timeA;
  }

  public void setTimeA(String timeA) {
    this.timeA = timeA;
  }

  // métodos de acesso timeB
  public String getTimeB() {
    return this.timeB;
  }

  public void setTimeB(String timeB) {
    this.timeB = timeB;
  }

  // métodos de acesso vencedor
  public String getVencedor() {
    return this.vencedor;
  }

  public void setVencedor(String vencedor) {
    this.vencedor = vencedor;
  }

  // métodos de acesso golsTimeA
  public int getGolsTimeA() {
    return this.golsTimeA;
  }

  public void setGolsTimeA(int golsTimeA) {
    this.golsTimeA = golsTimeA;
  }

  // métodos de acesso golsTimeB
  public int getGolsTimeB() {
    return this.golsTimeB;
  }

  public void setGolsTimeB(int golsTimeB) {
    this.golsTimeB = golsTimeB;
  }

  public int verificaVencedor() {
    int golsTimeA;
    int golsTimeB;
    String vencedor;
    String empate;

    golsTimeA = this.getGolsTimeA();
    golsTimeB = this.getGolsTimeB();

    if (golsTimeA > golsTimeB) {
      // vencedor = this.getTimeA();
      return 1;
    } else if (golsTimeA < golsTimeB) {
      // vencedor = this.getTimeB();
      return 2;
    } else {
      // empate
      return 0;
    }
    // this.setVencedor(vencedor);
  }

  private void imprimeResultado() {
    int vencedor;
    String timeA;
    String timeB;

    timeA = getTimeA();
    timeB = getTimeB();
    vencedor = verificaVencedor();

    if (vencedor == 0) {
      System.out.printf("Os times %s e %s empataram", timeA, timeB);
    } else if (vencedor == 1) {
      System.out.printf("%s foi o vencedor da partida.\n", timeA);
    } else {
      System.out.printf("%s foi o vencedor da partida.\n", timeB);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    TimeVencedor objOperator;

    String timeA;
    String timeB;
    int golsTimeA;
    int golsTimeB;

    timeA = scan.next();
    golsTimeA = scan.nextInt();
    timeB = scan.next();
    golsTimeB = scan.nextInt();

    objOperator = new TimeVencedor(timeA, timeB, golsTimeA, golsTimeB);

    objOperator.verificaVencedor();
    objOperator.imprimeResultado();
  }
}
