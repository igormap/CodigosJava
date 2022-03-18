import java.util.Scanner;

public class Situacao {

  private float nota1;
  private float nota2;
  private float nota3;

  public Situacao(float nota1, float nota2, float nota3) {
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  public float getNota1() {
    return this.nota1;
  }

  public void setNota1(float nota1) {
    this.nota1 = nota1;
  }

  public float getNota2() {
    return this.nota2;
  }

  public void setNota2(float nota2) {
    this.nota2 = nota2;
  }

  public float getNota3() {
    return this.nota3;
  }

  public void setNota3(float nota3) {
    this.nota3 = nota3;
  }

  public float calculaMedia() {
    float nota1;
    float nota2;
    float nota3;
    float media;

    nota1 = this.getNota1();
    nota2 = this.getNota2();
    nota3 = this.getNota3();

    media = (nota1 + nota2 + nota3) / 3;

    return media;
  }

  public String verificaSituacao() {
    float media;
    String situacao;

    media = calculaMedia();

    if (media >= 7) {
      situacao = "Aprovado";
    } else {
      if (media < 3) {
        situacao = "Reprovado";
      } else {
        situacao = "Prova Final";
      }
    }

    return situacao;
  }

  public void imprimeSituacao() {
    String situacao;

    situacao = verificaSituacao();

    System.out.println(situacao);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Situacao objOperator;

    float nota1;
    float nota2;
    float nota3;

    nota1 = scan.nextInt();
    nota2 = scan.nextInt();
    nota3 = scan.nextInt();

    objOperator = new Situacao(nota1, nota2, nota3);

    objOperator.imprimeSituacao();
  }
}
