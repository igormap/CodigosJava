import java.util.Scanner;

public class Triangulo {

  private int lado1;
  private int lado2;
  private int lado3;

  public int getLado1() {
    return this.lado1;
  }

  public void setLado1(int lado1) {
    this.lado1 = lado1;
  }

  public int getLado2() {
    return this.lado2;
  }

  public void setLado2(int lado2) {
    this.lado2 = lado2;
  }

  public int getLado3() {
    return this.lado3;
  }

  public void setLado3(int lado3) {
    this.lado3 = lado3;
  }

  // verifica se é possível formar triângulpo
  public boolean verificaTriangulo() {
    int lado1;
    int lado2;
    int lado3;

    lado1 = this.getLado1();
    lado2 = this.getLado2();
    lado3 = this.getLado3();

    if (
      lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2
    ) {
      return true;
    } else {
      return false;
    }
  }

  // verifica qual o tipo de triangulo
  public int verificaTipoTriangulo() {
    int lado1;
    int lado2;
    int lado3;

    lado1 = this.getLado1();
    lado2 = this.getLado2();
    lado3 = this.getLado3();

    if (lado1 == lado2 && lado2 == lado3) {
      // equilatero
      return 1;
    } else {
      if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
        // escaleno
        return 3;
      } else {
        // isosceles
        return 2;
      }
    }
  }

  public void imprimeTriangulo() {
    boolean ehTriangulo;
    int tipoTriangulo;

    tipoTriangulo = verificaTipoTriangulo();
    ehTriangulo = verificaTriangulo();

    if (!ehTriangulo) {
      tipoTriangulo = 0;
    }

    System.out.println(tipoTriangulo);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Triangulo objOperator = new Triangulo();

    int lado1;
    int lado2;
    int lado3;

    lado1 = scan.nextInt();
    lado2 = scan.nextInt();
    lado3 = scan.nextInt();

    objOperator.setLado1(lado1);
    objOperator.setLado2(lado2);
    objOperator.setLado3(lado3);

    objOperator.imprimeTriangulo();
  }
}
