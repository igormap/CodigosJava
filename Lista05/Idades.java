import java.util.Scanner;

public class Idades {

  private float idade;

  public Idades(float idade) {
    this.idade = idade;
  }

  public float getIdade() {
    return this.idade;
  }

  public void setIdade(float idade) {
    this.idade = idade;
  }

  public String calculaIdade() {
    float idade;

    idade = this.getIdade();
    if (idade < 10) {
      return "infancia";
    } else {
      if (idade >= 10 && idade <= 14) {
        return "pre-adolescencia";
      } else {
        if (idade >= 15 && idade <= 19) {
          return "adolescencia";
        } else {
          return "juventude";
        }
      }
    }
  }

  public void imprimeIdade() {
    String fase;

    fase = calculaIdade();

    System.out.println(fase);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Idades objOperator;

    float idade;

    idade = scan.nextFloat();

    objOperator = new Idades(idade);

    objOperator.imprimeIdade();
  }
}
