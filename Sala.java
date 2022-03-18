import java.util.Scanner;

public class Sala {

  private String salaID;

  public String getSalaID() {
    return this.salaID;
  }

  public void setSalaID(String novoID) {
    this.salaID = salaID;
  }

  public void estatisticaIdadeAlunos() {
    boolean leituraPositiva;
    int idade, somaIdade, contAlunos, menorIdade, maiorIdade, indiceMaior, indiceMenor;
    float mediaIdade;
    Scanner ler;

    ler = new Scanner(System.in);

    System.out.println("Entre com a idade de um aluno (-1 para sair): ");

    idade = ler.nextInt();
    maiorIdade = idade;
    menorIdade = idade;
    indiceMaior = 0;
    indiceMenor = 0;
    contAlunos = 1;
    somaIdade = idade;
    leituraPositiva = true;

    while (leituraPositiva) {
      System.out.println("Entre com a idade de um aluno (-1 para sair): ");
      idade = ler.nextInt();
      //System.out.println(idade);
      if (idade < 0) {
        System.out.println("Leitura terminada - imprimindo estatisticas..");
        leituraPositiva = false;
      } else {
        somaIdade = somaIdade + idade;

        if (idade < menorIdade) {
          menorIdade = idade;
          indiceMenor = contAlunos;
        } else {
          if (idade > maiorIdade) {
            maiorIdade = idade;
            indiceMaior = contAlunos;
          }
        }

        if (idade <= 20) {}
      }

      contAlunos++;
    }

    mediaIdade = (float) somaIdade / contAlunos;

    System.out.println("A média de idade da turma eh: " + mediaIdade);
    System.out.println("A quantidade d alunos da turma eh: " + contAlunos);
    System.out.println(
      "A idade do aluno mais novo eh: " +
      menorIdade +
      "e estava no indice" +
      indiceMenor
    );
    System.out.println(
      "A idade do aluno mais velho eh: " +
      maiorIdade +
      "e estava no indice" +
      indiceMaior
    );
    System.out.println(contAlunos);
  }

  public static void main(String[] args) {
    Sala sala301;

    sala301 = new Sala();

    sala301.estatisticaIdadeAlunos();
  }
}
