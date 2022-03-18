import java.util.Scanner;

public class FazendinhaToya {

  private int qtdPretos, qtdBrancos; 
  private float pesoPretos, pesoBrancos;

  FazendinhaToya() {
    this.qtdPretos = 0;
    this.qtdBrancos = 0;
    this.pesoPretos = 0;
    this.pesoBrancos = 0;
  }

  public int getQtdBrancos() {
      return qtdBrancos;
  }

  public void setQtdBrancos(int qtdBrancos) {
      this.qtdBrancos = qtdBrancos;
  }

  public int getQtdPretos() {
    return this.qtdPretos;
  }

  public void setQtdPretos(int qtdPretos) {
    this.qtdPretos = qtdPretos;
  }

  public float getPesoBrancos() {
    return this.pesoBrancos;
  }

  public void setPesoBrancos(float pesoBrancos) {
    this.pesoBrancos = pesoBrancos;
  }

  public float getPesoPretos() {
    return this.pesoPretos;
  }

  public void setPesoPretos(float pesoPretos) {
    this.pesoPretos = pesoPretos;
  }

  public void calculaBois() {
    Scanner scan = new Scanner(System.in);
    int i, j, qtdBois;
    float peso;
    char raca;

    int qtdTotalOperacoes = scan.nextInt();

    for (i = 0; i <= qtdTotalOperacoes; i++) {
      raca = scan.next().charAt(0);
      
      qtdBois = scan.nextInt();
      for (j = 0; j <= qtdBois; j++) {
        
        peso = scan.nextFloat();
        if (raca == 'b') {
          this.setPesoBrancos(this.getPesoBrancos() + peso);
          this.setQtdBrancos(this.getQtdBrancos() + 1);
        } else {
          if (raca == 'p') {
            this.setPesoPretos(this.getPesoPretos() + peso);
            this.setQtdPretos(this.getQtdPretos() + 1);
          }
        }
      }
    }
  }

  public void imprimeBois() {
    this.calculaBois();

    System.out.printf("Quantidade de bois brancos: %d\n", this.getQtdBrancos());
    System.out.printf("Peso total dos bois brancos: %.2f KG\n", this.getPesoBrancos());
    System.out.printf("Quantidade de bois pretos: %d\n", this.getQtdPretos());
    System.out.printf("Peso total dos bois pretos: %.2f KG\n", this.getPesoPretos());
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FazendinhaToya objectLoop = new FazendinhaToya();



    // int qtdTotalOperacoes = scanner.nextInt();
    // String raca = scanner.nextLine();
    // int qtdBrancos = scanner.nextInt();
    // float pesoBrancos = scanner.nextFloat();
    // int qtdPretos = scanner.nextInt();
    // float pesoPretos = scanner.nextFloat();
    objectLoop.imprimeBois();
  }
}
