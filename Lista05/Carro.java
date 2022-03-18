import java.util.Scanner;

public class Carro {

  private float distancia;
  private float litros;

  public Carro(float distancia, float litros) {
    this.distancia = distancia;
    this.litros = litros;
  }

  // métodos de acesso distancia
  public float getDistancia() {
    return this.distancia;
  }

  public void setDistancia(float distancia) {
    this.distancia = distancia;
  }

  // métodos de acesso litros
  public float getLitros() {
    return this.litros;
  }

  public void setLitros(float litros) {
    this.litros = litros;
  }

  //   calcula consumo retornado a relacao distancia / litros
  public float calculaConsumo() {
    float distancia;
    float litros;
    float consumo;

    distancia = this.getDistancia();
    litros = this.getLitros();
    consumo = distancia / litros;

    return consumo;
  }

  //  imprime a mensagem final com base no consumo
  public void imprimeMensagem() {
    float consumo;

    consumo = calculaConsumo();

    if (consumo < 8) {
      System.out.println("Venda o carro!");
    } else {
      if (consumo <= 14) {
        System.out.println("Economico!");
      } else {
        System.out.println("Super Economico!");
      }
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Carro objOperator;

    float distancia;
    float litros;

    distancia = scan.nextFloat();
    litros = scan.nextFloat();

    objOperator = new Carro(distancia, litros);

    objOperator.imprimeMensagem();
  }
}
