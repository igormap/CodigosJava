import java.util.Scanner;

public class Pessoa {

  private String nome;
  private String profissao;
  private float altura;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getProfissao() {
    return profissao;
  }

  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  //   public static void compararAltura() {

  //   }

  public static void printTaller(int tam, Pessoa pessoas[]) {
    int i;
    Pessoa maior = new Pessoa();

    maior = pessoas[0];

    for (i = 1; i < tam; i++) {
      if (pessoas[i].altura > maior.altura) {
        maior = pessoas[i];
      }
    }

    System.out.println(maior.nome);
    System.out.println(maior.altura);
    System.out.println(maior.profissao);
  }

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int i;
    int tam = 1;

    Pessoa pessoas[] = new Pessoa[tam];

    for (i = 0; i < tam; i++) {
      pessoas[i] = new Pessoa();
    }

    for (i = 0; i < tam; i++) {
      pessoas[i].nome = scan.nextLine();
    }

    for (i = 0; i < tam; i++) {
      pessoas[i].profissao = scan.nextLine();
    }

    for (i = 0; i < tam; i++) {
      pessoas[i].setAltura(scan.nextFloat());
    }

    printTaller(tam, pessoas);
  }
}
