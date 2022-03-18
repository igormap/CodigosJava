import java.util.Scanner;

public class Troca {
	private int numberA;
	private int numberB;
	
	public int getNumberA() {
		return this.numberA;
	}
	
	public void setNumberA(int numA) {
		this.numberA = numA;
	}
	
	public int getNumberB() {
		return this.numberB;
	}
	
	public void setNumberB(int numB) {
		this.numberB = numB;
	}
	
	public void trocaValores() {
		int numA;
		int numB;
		
		numA = this.getNumberA();
		numB = this.getNumberB();
		
		this.setNumberA(numB);
		this.setNumberB(numA);
	}
	
	public void imprimeValores() {
		int numA;
		int numB;
		
		numA = this.getNumberA();
		numB = this.getNumberB();
		
		System.out.printf("A: %d\n", numA);
		System.out.printf("B: %d\n", numB);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Troca objTroca = new Troca();
		
		int numA;
		int numB;
		
		numA = scan.nextInt();
		numB = scan.nextInt();
		
		objTroca.setNumberA(numA);
		objTroca.setNumberB(numB);
		
		objTroca.trocaValores();
		objTroca.imprimeValores();		
	}
}
