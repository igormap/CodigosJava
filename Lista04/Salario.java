import java.util.Scanner;

public class Salario {

  private float salario;
  private float prestacao;

  public float getSalario() {
    return this.salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public float getPrestacao() {
    return this.prestacao;
  }

  public void setPrestacao(float prestacao) {
    this.prestacao = prestacao;
  }

  public boolean emprestimo() {
    float salario;
    float prestacao;
    float porcentagem;

    salario = this.getSalario();
    prestacao = this.getPrestacao();

    porcentagem = prestacao / salario * 100;

    if (porcentagem < 20) {
      return true;
    } else {
      return false;
    }
  }

  public void imprimeEmprestimo() {
    boolean resposta;

    resposta = emprestimo();

    if (resposta) {
      System.out.println("Emprestimo concedido!!!");
    } else {
      System.out.println("Emprestimo nao concedido...");
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Salario objOperator = new Salario();

    float salario;
    float prestacao;

    salario = scan.nextFloat();
    prestacao = scan.nextFloat();

    objOperator.setSalario(salario);
    objOperator.setPrestacao(prestacao);

    objOperator.imprimeEmprestimo();
  }
}
