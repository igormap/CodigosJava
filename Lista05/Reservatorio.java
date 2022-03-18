import java.util.Scanner;

public class Reservatorio {

  private float altura;
  private float largura;
  private float comprimento;
  private float consumo;

  public Reservatorio(
    float altura,
    float largura,
    float comprimento,
    float consumo
  ) {
    this.altura = altura;
    this.largura = largura;
    this.comprimento = comprimento;
    this.consumo = consumo;
  }

  // métodos para acessar altura
  public float getAltura() {
    return this.altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  // métodos para acessar largura
  public float getLargura() {
    return this.largura;
  }

  public void setLargura(float largura) {
    this.largura = largura;
  }

  // métodos para acessar comprimento
  public float getComprimento() {
    return this.comprimento;
  }

  public void setComprimento(float comprimento) {
    this.comprimento = comprimento;
  }

  // métodos para acessar consumo
  public float getConsumo() {
    return this.consumo;
  }

  public void setConsumo(float consumo) {
    this.consumo = consumo;
  }

  public float calculaReservatorio() {
    float altura;
    float largura;
    float comprimento;
    float capacidade;

    altura = this.getAltura();
    largura = this.getLargura();
    comprimento = this.getComprimento();

    capacidade = altura * largura * comprimento;

    // transformando cm3 em litros
    capacidade = capacidade / 1000;

    return capacidade;
  }

  public float calculaAutonomia() {
    float capacidade;
    float consumo;
    float autonomia;

    capacidade = calculaReservatorio();
    consumo = this.getConsumo();

    autonomia = capacidade / consumo;

    // retorna autonomia do reservatória em dias
    return autonomia;
  }

  public String verificaClassificacao() {
    String classificacao;
    float autonomia;

    autonomia = calculaAutonomia();

    if (autonomia < 2) {
      classificacao = "Consumo Elevado";
    } else {
      if (autonomia <= 7) {
        classificacao = "Consumo Moderado";
      } else {
        classificacao = "Consumo Reduzido";
      }
    }

    return classificacao;
  }

  public void imprimeMensagem() {
    float capacidade;
    float autonomia;
    String classificacao;

    capacidade = calculaReservatorio();
    autonomia = calculaAutonomia();
    classificacao = verificaClassificacao();

    System.out.printf("Capacidade do Reservatorio= %.1f litros\n", capacidade);
    System.out.printf("Autonomia do reservatorio= %.1f dias\n", autonomia);
    System.out.println(classificacao);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Reservatorio objOperator;

    float altura;
    float largura;
    float comprimento;
    float consumo;

    altura = scan.nextFloat();
    largura = scan.nextFloat();
    comprimento = scan.nextFloat();
    consumo = scan.nextFloat();

    objOperator = new Reservatorio(altura, largura, comprimento, consumo);

    objOperator.imprimeMensagem();
  }
}
