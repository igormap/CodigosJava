import java.util.Scanner;

public class Maior {
		private float number1;
		private float number2;
		private float number3;
		private float maior;
	
	public float getNumber1() {
		return this.number1;
	}
	
	public void setNumber1(float num1) {
		this.number1 = num1;
	} 
	
	public float getNumber2() {
		return this.number2;
	}
	
	public void setNumber2(float num2) {
		this.number2 = num2;
	} 
	
	public float getNumber3() {
		return this.number3;
	}
	
	public void setNumber3(float num3) {
		this.number3 = num3;
	} 
	
	public float getMaior() {
		return this.maior;
	}
	
	public void setMaior(float maior) {
		this.maior = maior;
	}
	
	public void verificaMaior() {
		float num1;
		float num2;
		float num3;
		float maior;
		
		num1 = this.getNumber1();
		num2 = this.getNumber2();
		num3 = this.getNumber3();
		
		if (n1 > n2 && n1 > n3) {
			maior = this.setMaior(n1);
		}
		else {
			if (n2 > n1 && n2 > n3) {
				maior = this.setMaior(n2);
			}
			else {
				if (n3 > n1 && n3 > n2) {
					maior = this.setMaior(n3);
				}
			}
		}
	}
	
	public void imprimeMaior() {
		float maior;
		
		maior = this.getMaior();
		
		System.out.printf("O Maior numero eh: %.2f", maior);
	}
	
	public static void main(String[] args) {
		Maior operator = new Maior();
		Scanner scan = new Scanner(System.in);
		
		float num1;
		float num2;
		float num3;
		
		num1 = scan.nextFloat();
		num2 = scan.nextFloat();
		num3 = scan.nextFloat();
		
		operator.setNumber1(num1);
		operator.setNumber2(num2);
		operator.setNumber3(num3);
		
		operator.verificaMaior();
		operator.imprimeMaior();
	}
}
