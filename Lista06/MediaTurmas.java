import java.util.Scanner;

public class MediaTurmas {

  private int turmas;

  public int getTurmas() {
    return turmas;
  }

  public void setTurmas(int turmas) {
    this.turmas = turmas;
  }

  public void calculaMedias() {
    Scanner scan = new Scanner(System.in);
    int i, j, alunos;
    int qtdTurmas;
    float nota, somaNotas;
    float medias[];

    qtdTurmas = scan.nextInt();
    this.setTurmas(qtdTurmas);
    medias = new float[qtdTurmas];

    for (i = 0; i < qtdTurmas; i++) {
      alunos = scan.nextInt();

      somaNotas = 0;
      for (j = 0; j < alunos; j++) {
        nota = scan.nextFloat();
        somaNotas += nota;
      }

      medias[i] = (float) somaNotas / alunos;
    }

    for (i = 0; i < qtdTurmas; i++) {
      System.out.printf("Media da turma %d = %.2f\n", (i + 1), medias[i]);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    MediaTurmas opt = new MediaTurmas();

    opt.calculaMedias();
  }
}
