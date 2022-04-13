import java.util.Scanner;

public class VetorLista08 {
    
    private int dimensao;
    private int[] vet;

    VetorLista08(int dimensao) {
        this.dimensao = dimensao;
        this.vet = new int[this.dimensao];
    }

    public int getDimensao() {
        return this.dimensao;
    }

    public void setDimensao(int  dimensao) {
        this.dimensao = dimensao;
    }

    public int getElemento(int index) {
        return this.vet[index];
    }

    public void setElemento(int  index, int valor) {
        this.vet[index] = valor;
    }

    public void inicializa(Scanner scan) {
        int i;

        for(i = 0; i < this.getDimensao(); i++) {
            this.vet[i] = scan.nextInt();
        }
    }

    public void troca(int indMaior, int indMenor) {
        int aux = this.getElemento(indMenor);

        this.setElemento(indMenor, this.getElemento(indMaior));
        this.setElemento(indMaior, aux);
    }

    public void buscaMenorMaior() {
        int i;
        int maior = 0;
        int menor = 0;

        for (i = 0; i < this.getDimensao(); i++) {
            if (this.getElemento(i) > maior) {
                maior = i;
            }
            else {
                if(this.getElemento(i) < menor) {
                    menor = i;
                }
            }
        }

        this.troca(maior, menor);

        for (i = 0; i < this.getDimensao(); i++) {
            System.out.println(this.getElemento(i) + " ");
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dimensao = scan.nextInt();
        VetorLista08 vet = new VetorLista08(dimensao);

        vet.inicializa(scan);
        vet.buscaMenorMaior();

    }
}
