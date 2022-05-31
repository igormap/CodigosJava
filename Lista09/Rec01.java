import java.util.Scanner;

public class Rec01 {

  private String valor;

  public String getValor() {
    return this.valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public String stringRecursiva(String valor, int pos) {
    if (pos == this.getValor().length() - 1) {
      return valor;
    } else {
      if (valor.charAt(pos) == valor.charAt(pos + 1)) {
        valor = valor.substring(0, pos + 1) + '#' + valor.substring(pos + 1);
        this.setValor(valor);
        pos++;
      }
    }

    return stringRecursiva(valor, pos + 1);
  }

  public String stringRecursiva(String valor) {
    if (pos == this.getValor().length() - 1) {
      return valor;
    } else {
      if (valor== valor.charAt(pos + 1)) {
        valor = valor.substring(0, pos + 1) + '#' + valor.substring(pos + 1);
        this.setValor(valor);
        pos++;
      }
    }

    return stringRecursiva(valor);
  }


  public static void main(String[] args) {
    Rec01 rec = new Rec01();
    Scanner scan = new Scanner(System.in);

    String valor = scan.nextLine();
    rec.setValor(valor);

    System.out.println(rec.stringRecursiva(rec.getValor(), 0));
  }
}
