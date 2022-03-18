import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int idade;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public void calculaIdade(int ano) {
		int idade;
		
		idade = 2021 - ano;
		
		this.setIdade(idade);
	}
	
	public void imprimePessoa() {
		String nome;
		int idade;
		
		nome = this.getNome();
		idade = this.getIdade();
		
		System.out.println("Nome: " + nome);
		System.out.printf("Idade: %d\n", idade);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pessoa objPessoa = new Pessoa();
		
		String nome;
		int ano;
		
		nome = scan.next();
		ano = scan.nextInt();
		
		objPessoa.setNome(nome);
		objPessoa.calculaIdade(ano);
		
		objPessoa.imprimePessoa();		
	}
	
	
}
