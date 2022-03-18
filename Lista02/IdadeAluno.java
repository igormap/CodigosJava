import java.util.Scanner;

public class IdadeAluno {

  private int maiorIdade, menorIdade, indiceIdadeMenor, indiceIdadeMaior, alunos2029, alunos3039, alunos4049, alunos50;
  private float mediaIdade;

  // getters & setters methods
  public int getMaiorIdade() {
    return this.maiorIdade;
  }

  public void setMaiorIdade(int maiorIdade) {
    this.maiorIdade = maiorIdade;
  }
  
  public int getMenorIdade() {
    return this.menorIdade;
  }

  public void setMenorIdade(int menorIdade) {
    this.menorIdade = menorIdade;
  }
  
  public int getIndiceIdadeMenor() {
    return this.indiceIdadeMenor;
  }

  public void setIndiceIdadeMenor(int indiceIdadeMenor) {
    this.indiceIdadeMenor = indiceIdadeMenor;
  }
  
  public int getIndiceIdadeMaior() {
    return this.indiceIdadeMaior;
  }

  public void setIndiceIdadeMaior(int indiceIdadeMaior) {
    this.indiceIdadeMaior = indiceIdadeMaior;
  }
  
  public int getAlunos2029() {
    return this.alunos2029;
  }

  public void setAlunos2029(int alunos2029) {
    this.alunos2029 = alunos2029;
  }
  
  public int getAlunos3039() {
    return this.alunos3039;
  }

  public void setAlunos3039(int alunos3039) {
    this.alunos3039 = alunos3039;
  }

  public int getAlunos4049() {
    return this.alunos4049;
  }

  public void setAlunos4049(int alunos4049) {
    this.alunos4049 = alunos4049;
  }

  public int getAlunos50() {
    return this.alunos50;
  }

  public void setAlunos50(int alunos50) {
    this.alunos50 = alunos50;
  }

  public float getMediaIdade() {
    return this.mediaIdade;
  }

  public void setMediaIdade(float mediaIdade) {
    this.mediaIdade = mediaIdade;
  }

  // add methods
  public void addAlunos2029() {
    this.alunos2029 = this.alunos2029 + 1;
  }

  public void addAlunos3039() {
    this.alunos3039 = this.alunos3039 + 1;
  }

  public void addAlunos4049() {
    this.alunos4049 = this.alunos4049 + 1;
  }

  public void addAlunos50() {
    this.alunos50 = this.alunos50 + 1;
  }

  public void atualizaFaixaEtaria(int idade) {
    if (idade >= 20 && idade <= 29) {
       this.addAlunos2029();
    } else {
      if (idade >= 30 && idade <= 39) {
        this.addAlunos3039();
      } else {
        if (idade >= 40 && idade <= 49) {
          this.addAlunos4049();
        } else {
          if (idade >= 50) {
            this.addAlunos50();
          }
        }
      }
    }
  }

  public void verificaMaiorMenor(int idade, int contAlunos) {
    int maiorIdade = this.getMaiorIdade();
    int menorIdade = this.getMenorIdade();

    // Verfica maior ou menor idade
    if (idade > maiorIdade) {
      this.setMaiorIdade(idade);
      this.setIndiceIdadeMaior(contAlunos);
    } else {
      if (idade < menorIdade) {
        this.setMenorIdade(idade);
        this.setIndiceIdadeMenor(contAlunos);
      }
    }
  }

  public void calculaMedia(int somaIdade, int contAlunos) {
    float mediaIdade;

    mediaIdade = (float) somaIdade / contAlunos;
    this.setMediaIdade(mediaIdade);
  }

  public void imprimeInformacoes(int contAlunos) {
    
    int menorIdade = this.getMenorIdade();
    int maiorIdade = this.getMaiorIdade();
    int indiceMenor = this.getIndiceIdadeMenor();
    int indiceMaior = this.getIndiceIdadeMaior();
    int alunos2029 = this.getAlunos2029();
    int alunos3039 = this.getAlunos3039();
    int alunos4049 = this.getAlunos4049();
    int alunos50 = this.getAlunos50();
    float mediaIdade = this.getMediaIdade();

    System.out.printf("A média de idade da turma eh: %.2f\n", mediaIdade);
    System.out.println("A idade do aluno mais novo eh: " + menorIdade + " e estava no indice " + indiceMenor);
    System.out.println("A idade do aluno mais velho eh: " + maiorIdade + " e estava no indice " + indiceMaior);
    System.out.println("Quantidade de alunos entre 20 e 29 anos: " + alunos2029);
    System.out.println("Quantidade de alunos entre 30 e 39 anos: " + alunos3039);
    System.out.println("Quantidade de alunos entre 40 e 49 anos: " + alunos4049);
    System.out.println("Quantidade de alunos com 50 anos ou mais: " + alunos50);
    System.out.println("Quantidade total de alunos: " + contAlunos);
  }

  public void estatisticaIdadeAlunos() {
    boolean leituraPositiva;
    int idade, somaIdade, contAlunos;
    Scanner ler;

    ler = new Scanner(System.in);

    System.out.println("Entre com a idade de um aluno (-1 para sair): ");
    idade = ler.nextInt();

    contAlunos = 1;
    somaIdade = idade;

    this.atualizaFaixaEtaria(idade);
    this.setMaiorIdade(idade);
    this.setIndiceIdadeMaior(contAlunos);
    this.setMenorIdade(idade);
    this.setIndiceIdadeMenor(contAlunos);

    leituraPositiva = true;

    while (leituraPositiva) {
      System.out.println("Entre com a idade de um aluno (-1 para sair): ");
      idade = ler.nextInt();

      if (idade < 0) {
        // leitura terminada
        ler.close();
        System.out.println("\nLeitura terminada - imprimindo estatisticas..");

        // seta parametro para encerrar laço
        leituraPositiva = false;

        // calcula media
        this.calculaMedia(somaIdade, contAlunos);

        this.imprimeInformacoes(contAlunos);
      } else {
        contAlunos++;

        somaIdade = somaIdade + idade;
        this.atualizaFaixaEtaria(idade);
        this.verificaMaiorMenor(idade, contAlunos);
      }
    }
  }

  public static void main(String[] args) {
    IdadeAluno sala301;

    sala301 = new IdadeAluno();

    sala301.estatisticaIdadeAlunos();
  }
}