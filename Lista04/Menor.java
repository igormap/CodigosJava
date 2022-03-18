import java.util.Scanner;

public class Menor {
		private int number1;
		private int number2;
		private int number3;
		private int menor;
	
	public int getNumber1() {
		return this.number1;
	}
	
	public void setNumber1(int num1) {
		this.number1 = num1;
	} 
	
	public int getNumber2() {
		return this.number2;
	}
	
	public void setNumber2(int num2) {
		this.number2 = num2;
	} 
	
	public int getNumber3() {
		return this.number3;
	}
	
	public void setNumber3(int num3) {
		this.number3 = num3;
	} 
	
	public int getMaior() {
		return this.maior;
	}
	
	public void setMenor(int menor) {
		this.menor = menor;
	}
	
	public void verificaMenor() {
		int num1;
		int num2;
		int num3;
		
		num1 = this.getNumber1();
		num2 = this.getNumber2();
		num3 = this.getNumber3();
		
		if (num1 < num2 && num1 < num3) {
			this.setMenor(num1);
		}
		else {
			if (num2 < num1 && num2 < num3) {
				this.setMenor(num2);
			}
			else {
				if (num3 < num1 && num3 < num2) {
					this.setMenor(num3);
				}
			}
		}
	}
	
	public void imprimeMenor() {
		int menor;
		
		menor = this.getMenor();
		
		System.out.printf("O Menor numero eh: %d", menor);
	}
	
	public static void main(String[] args) {
		Menor operator = new Menor();
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		operator.setNumber1(num1);
		operator.setNumber2(num2);
		operator.setNumber3(num3);
		
		operator.verificaMenor();
		operator.imprimeMenor();
	}
}

