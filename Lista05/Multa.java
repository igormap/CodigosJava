import java.util.Scanner;

public class Multa {

  private String nome;
  private int velocidadePermitida;
  private int velocidadeMotorista;

  public Multa(String nome, int velocidadePermitida, int velocidadeMotorista) {
    this.nome = nome;
    this.velocidadePermitida = velocidadePermitida;
    this.velocidadeMotorista = velocidadeMotorista;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getVelocidadePermitida() {
    return this.velocidadePermitida;
  }

  public void setVelocidadePermitida(int velocidadePermitida) {
    this.velocidadePermitida = velocidadePermitida;
  }

  public int getVelocidadeMotorista() {
    return this.velocidadeMotorista;
  }

  public void setVelocidadeMotorista(int velocidadeMotorista) {
    this.velocidadeMotorista = velocidadeMotorista;
  }

  public int verifica(int velocidadePermitida) {
    int velocidadeMotorista;
    int diferenca;

    velocidadeMotorista = this.getVelocidadeMotorista();

    diferenca = velocidadeMotorista - velocidadePermitida;

    if (diferenca <= 0) {
      return 0;
    } else {
      return diferenca;
    }
  }

  public int calculaMulta() {
    int diferenca;
    int velocidadePermitida;

    velocidadePermitida = this.getVelocidadePermitida();

    diferenca = this.verifica(velocidadePermitida);

    if (diferenca == 0) {
      return 0;
    } else {
      if (diferenca <= 10) {
        return 50;
      } else {
        if (diferenca <= 30) {
          return 100;
        } else {
          return 200;
        }
      }
    }
  }

  public void imprimeMulta() {
    String nome;
    int multa;

    nome = this.getNome();
    multa = this.calculaMulta();

    if (multa == 0) {
      System.out.printf("Motorista: %s\nSem multa\n", nome);
    } else {
      System.out.printf("Motorista: %s\nMulta: R$ %d\n", nome, multa);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Multa objOperator;

    String nome;
    int velocidadePermitida;
    int velocidadeMotorista;

    nome = scan.next();
    velocidadePermitida = scan.nextInt();
    velocidadeMotorista = scan.nextInt();

    objOperator = new Multa(nome, velocidadePermitida, velocidadeMotorista);

    objOperator.imprimeMulta();
  }
}
