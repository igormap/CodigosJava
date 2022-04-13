    import java.util.Scanner;

    public class VetorLista01 {

    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void imprimeInverso() {
        char car;
        String invertido = "";
        int tamanho = this.getValor().length();
        int i;

        for (i = tamanho - 1; i >= 0; i--) {
        car = this.getValor().charAt(i);
        // invertido += Character.toString(car);

        invertido += car + "";
        }

        System.out.print(invertido);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VetorLista01 vetor = new VetorLista01();

        String valor = scan.nextLine();
        vetor.setValor(valor);

        vetor.imprimeInverso();
    }
    }
