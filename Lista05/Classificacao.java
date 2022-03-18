import java.util.Scanner;

public class Classificacao {

  private int lado1;
  private int lado2;
  private int lado3;
  private String tipoAngulo;

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

  public String getTipoAngulo() {
    return this.tipoAngulo;
  }

  public void setTipoAngulo(String tipoAngulo) {
    this.tipoAngulo = tipoAngulo;
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

  // verifica tipo de angulo do triangulo
  public void verificaAngulo() {
    int lado1;
    int lado2;
    int lado3;
    String tipoAngulo;

    lado1 = this.getLado1();
    lado2 = this.getLado2();
    lado3 = this.getLado3();

    if ((lado1 * lado1) == (lado2 * lado2) + (lado3 * lado3)) {
      tipoAngulo = "Triangulo retangulo.";
      this.setTipoAngulo(tipoAngulo);
    } else {
      if ((lado1 * lado1) > (lado2 * lado2) + (lado3 * lado3)) {
        tipoAngulo = "Triangulo obtusangulo.";
        this.setTipoAngulo(tipoAngulo);
      } else {
        if ((lado1 * lado1) < (lado2 * lado2) + (lado3 * lado3)) {
          tipoAngulo = "Triangulo acutangulo.";
          this.setTipoAngulo(tipoAngulo);
        }
      }
    }
  }

  // verifica qual o tipo de triangulo
  public String verificaTipoTriangulo() {
    int lado1;
    int lado2;
    int lado3;

    lado1 = this.getLado1();
    lado2 = this.getLado2();
    lado3 = this.getLado3();

    if (lado1 == lado2 && lado2 == lado3) {
      // equilatero
      return "Triangulo equilatero.";
    } else {
      if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
        // escaleno
        return "Triangulo escaleno.";
      } else {
        // isosceles
        return "Triangulo isosceles.";
      }
    }
  }

  public void imprimeTriangulo() {
    String tipoAngulo;
    String tipoTriangulo;
    boolean ehTriangulo;

    ehTriangulo = verificaTriangulo();

    if (ehTriangulo) {
      tipoAngulo = getTipoAngulo();
      tipoTriangulo = verificaTipoTriangulo();
      System.out.printf("%s\n%s\n", tipoAngulo, tipoTriangulo);
    } else {
      System.out.println("As medidas nao formam um triangulo.");
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Classificacao objOperator = new Classificacao();

    int lado1;
    int lado2;
    int lado3;

    lado1 = scan.nextInt();
    lado2 = scan.nextInt();
    lado3 = scan.nextInt();

    objOperator.setLado1(lado1);
    objOperator.setLado2(lado2);
    objOperator.setLado3(lado3);

    objOperator.verificaAngulo();
    objOperator.imprimeTriangulo();
  }
}
