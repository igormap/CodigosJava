import java.util.Scanner;

public class Divida {
	private int qtdDias;
	private float dividaOriginal;
	private float multaDiaria;
	private float novaDivida;
	
	public float getDividaOriginal() {
		return this.dividaOriginal;
	}
	
	public void  setDividaOriginal(float dvdOriginal) {
		this.dividaOriginal = dvdOriginal;
	}
	
	public float getNovaDivida() {
		return this.novaDivida;
	}
	
	public void  setNovaDivida(float novaDivida) {
		this.novaDivida = novaDivida;
	}
	
	public int getQtdDias() {
		return this.qtdDias;
	}
	
	public void  setQtdDias(int dias) {
		this.qtdDias = dias;
	}
	
	public float getMultaDiaria() {
		return this.multaDiaria;
	}
	
	public void  setMultaDiaria(float multa) {
		this.multaDiaria = multa;
	}
	
	public void calculaDivida() {
		float dvdOriginal;
		float multa;
		int dias;
		float novaDivida;
			
		dvdOriginal = this.getDividaOriginal();
		dias = this.getQtdDias();
		multa = this.getMultaDiaria();
		
		novaDivida = (dvdOriginal + multa * dias) / 100;
		
		this.setNovaDivida(novaDivida);
	}
	
	public void imprimeDividaAtual() {
		float novaDivida;
		
		novaDivida = this.getNovaDivida();
		
		System.out.printf("O valor da sua divida atual eh: %.2f", novaDivida);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Divida objDivida = new Divida();
		
		float dvdOriginal;
		float multa;
		int dias;
		
		dvdOriginal = scan.nextFloat();
		dias = scan.nextInt();
		multa = scan.nextFloat();
		
		objDivida.setDividaOriginal(dvdOriginal);
		objDivida.setQtdDias(dias);
		objDivida.setMultaDiaria(multa);
		
		objDivida.calculaDivida();
		objDivida.imprimeDividaAtual();
	}
}
