import java.util.Scanner;

public class Eleitor {

  private int idade;

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String verificaObrigatoriedade() {
    int idade;
    String situacao;

    idade = this.getIdade();

    if (idade < 16) {
      situacao = "nao votante";
    } else {
      if (idade >= 18 && idade <= 65) {
        situacao = "eleitor obrigatorio";
      } else {
        situacao = "eleitor facultativo";
      }
    }

    return situacao;
  }

  public void imprimeMensagem() {
    String situacao;

    situacao = verificaObrigatoriedade();

    System.out.println(situacao);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Eleitor objOperator = new Eleitor();

    int idade;

    idade = scan.nextInt();

    objOperator.setIdade(idade);
    objOperator.imprimeMensagem();
  }
}
