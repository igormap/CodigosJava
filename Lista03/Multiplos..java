import java.util.Scanner;

public class Multiplos {
	private int number1;
	private int number2;
	
	public int getNumber1() {
		return this.number1;
	}
	
	public void setNumber1(int n1) {
		this.number1 = n1;
	}
	
	public int getNumber2() {
		return this.number2;
	}
	
	public void setNumber2(int n2) {
		this.number2 = n2;
	}
	
	public void verificaMaior() {
		int n1;
		int n2;
		
		n1 = this.getNumber1();
		n2 = this.getNumber2();
		
		if (n2 > n1) {
			n1 = this.setNumber2();
			n2 = this.setNumber1();
		}
	}
	
	public void verificaMultiplos() {
		int n1;
		int n2;
		int divisao;
		
		n1 = this.getNumber1();
		n2 = this.getNumber2();
		divisao = n1 % n2;
		
		if (divisao == 0) {
			System.out.println("Numero " + n1 + " eh multiplo de " + n2);
		} 
			
		System.out.println("The last mission is over");
	}

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		Multiplos objOperador = new Multiplos();
		
		int n1;
		int n2;
		
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		
		objOperador.setNumber1(n1);
		objOperador.setNumber2(n2);
		
		objOperador.verificaMaior();
		objOperador.verificaMultiplos();
	}
}
