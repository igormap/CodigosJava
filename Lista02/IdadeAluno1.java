import java.util.Scanner;

public class IdadeAluno1 {

  private String salaID;

  public String getSalaID() {
    return this.salaID;
  }

  public void setSalaID(String novoID) {
    this.salaID = salaID;
  }

  public void estatisticaIdadeAlunos() {
    boolean leituraPositiva;
    int idade, somaIdade, contAlunos, menorIdade, maiorIdade, indiceMaior, indiceMenor, alunos2029, alunos3039, alunos4049, alunos50;
    float mediaIdade;
    Scanner ler;

    ler = new Scanner(System.in);

    System.out.println("Entre com a idade de um aluno (-1 para sair): ");

    idade = ler.nextInt();
    maiorIdade = idade;
    menorIdade = idade;
    indiceMaior = 0;
    indiceMenor = 0;
    alunos2029 = 0;
    alunos3039 = 0;
    alunos4049 = 0;
    alunos50 = 0;
    contAlunos = 1;

    somaIdade = idade;
    leituraPositiva = true;

    while (leituraPositiva) {
      System.out.println("Entre com a idade de um aluno (-1 para sair): ");
      idade = ler.nextInt();
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

        if (idade >= 20 && idade <= 29) {
          alunos2029++;
        } else {
          if (idade >= 30 && idade <= 39) {
            alunos3039++;
          } else {
            if (idade >= 40 && idade <= 49) {
              alunos4049++;
            } else {
              if (idade >= 50) {
                alunos50++;
              }
            }
          }
        }
      }

      contAlunos++;
    }

    mediaIdade = (float) somaIdade / contAlunos;

    System.out.println("A média de idade da turma eh: " + mediaIdade);
    System.out.println("A quantidade d alunos da turma eh: " + contAlunos);
    System.out.println("A idade do aluno mais novo eh: " + menorIdade + " e estava no indice " + indiceMenor);
    System.out.println("A idade do aluno mais velho eh: " + maiorIdade + " e estava no indice " + indiceMaior);
    System.out.println("Quantidade de alunos entre 20 e 29 anos: " + alunos2029);
    System.out.println("Quantidade de alunos entre 30 e 39 anos: " + alunos3039);
    System.out.println("Quantidade de alunos entre 40 e 49 anos: " + alunos4049);
    System.out.println("Quantidade de alunos com 50 anos ou mais: " + alunos50);
    System.out.println("Quantidade total de alunos: " + contAlunos);
  }

  public static void main(String[] args) {
    IdadeAluno1 sala301;

    sala301 = new IdadeAluno1();

    sala301.estatisticaIdadeAlunos();
  }
}
