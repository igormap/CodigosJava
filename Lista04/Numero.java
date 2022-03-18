// Sua colega Maria está com dificuldades em uma tafera de matemática onde dados 3 números ela deve colocá-los em ordem decrescente, como você manja muito de programação resolveu ajudá-la. O programa inicia e o usuário informa os 3 números ao final seu programa deve imprimir todos os números em ordem decrescente.

// Dicas
// A classe deve se chamar Numero.
// Sua classe deve ter somente um atributo do tipo int.
// Crie um método chamado ordemDecrescente(Numero num1, Numero num2), que imprime os números em ordem decrescente.
// Observe os casos de teste.
// Não se prenda somente aos exemplos mostrados.
// Qualquer dúvida entre em contato com os monitores.

import java.util.Scanner;

public class Numero {

  private int number;

  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void ordemDecresente(Numero num1, Numero num2) {
    int a;
    int b;
    int c;

    a = this.getNumber();
    b = num1.number;
    c = num2.number;

    if (a >= b && b >= c) {
      System.out.printf("%d %d %d\n", a, b, c);
      //System.out.println(a + " " + b + " " + c);
    } else {
      if (a >= b && b <= c && a >= c) {
        System.out.printf("%d %d %d\n", a, c, b);
        //System.out.println(a + " " + c + " " + b);
      } else {
        if (b >= a && a >= c) {
          System.out.printf("%d %d %d\n", b, a, c);
          //System.out.println(b + " " + a + " " + c);
        } else {
          if (b >= a && a <= c && b >= c) {
            System.out.printf("%d %d %d\n", b, c, a);
            //System.out.println(b + " " + c + " " + a);
          } else {
            if (c >= a && a >= b) {
              System.out.printf("%d %d %d\n", c, a, b);
              //System.out.println(c + " " + a + " " + b);
            } else {
              if (c >= a && a <= b && c >= b) {
                System.out.printf("%d %d %d\n", c, b, a);
                //System.out.println(c + " " + b + " " + a);
              }
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Numero objOperator = new Numero();

    Numero num1 = new Numero();
    Numero num2 = new Numero();

    int numero;

    numero = scan.nextInt();
    objOperator.setNumber(numero);

    numero = scan.nextInt();
    num1.setNumber(numero);

    numero = scan.nextInt();
    num2.setNumber(numero);

    objOperator.ordemDecresente(num1, num2);
  }
}
