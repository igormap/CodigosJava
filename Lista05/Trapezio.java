import java.util.Scanner;

public class Trapezio {

  private int baseMaior;
  private int baseMenor;
  private int altura;

  public Trapezio(int baseMaior, int baseMenor, int altura) {
    this.baseMaior = baseMaior;
    this.baseMenor = baseMenor;
    this.altura = altura;
  }

  public int getBaseMaior() {
    return this.baseMaior;
  }

  public void setBaseMaior(int baseMaior) {
    this.baseMaior = baseMaior;
  }

  public int getBaseMenor() {
    return this.baseMenor;
  }

  public void setBaseMenor(int baseMenor) {
    this.baseMenor = baseMenor;
  }

  public int getAltura() {
    return this.altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public int calculaArea() {
    int baseMaior;
    int baseMenor;
    int altura;
    int area;

    baseMaior = this.getBaseMaior();
    baseMenor = this.getBaseMenor();
    altura = this.getAltura();

    area = ((baseMaior + baseMenor) * altura) / 2;

    return area;
  }

  public String verificaClassicacao() {
    int area;
    String classificacao;

    area = calculaArea();

    if (area < 5) {
      classificacao = "Pequeno";
    } else {
      if (area >= 5 && area <= 10) {
        classificacao = "Normal";
      } else {
        classificacao = "Grande";
      }
    }

    return classificacao;
  }

  public void imprimeClassificacao() {
    String classificacao;

    classificacao = verificaClassicacao();

    System.out.println(classificacao);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Trapezio objOperator;

    int baseMaior;
    int baseMenor;
    int altura;

    baseMaior = scan.nextInt();
    baseMenor = scan.nextInt();
    altura = scan.nextInt();

    objOperator = new Trapezio(baseMaior, baseMenor, altura);

    objOperator.imprimeClassificacao();
  }
}
