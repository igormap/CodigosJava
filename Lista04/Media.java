import java.util.Scanner;

public class Media {
		private float number1
		private float number2;
		private float number3, 
		private float media;
	
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
	
	public float getMedia() {
		return this.media;
	}
	
	public void setMedia(float med) {
		this.media = med;
	} 
	
	public void calculaMedia() {
		float num1;
		float num2;
		float num3;
		float media;
		
		media = (num1 + num2 + num3) / 3;
		
		this.setMedia(media);
	}
	
	public void imprimeMedia() {
		float media;
		
		media = this.calculaMedia();
		
		System.out.printf("Media: %.2f", media, " infelizmente ta reprovado");
	}
	
	public static void main(String[] args) {
		Media operator = new Media();
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
		
		operator.imprimeMedia();
	}
}
