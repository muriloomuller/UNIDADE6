import java.util.Scanner;

public class Ex6 {
    private Scanner s;

    public Ex6() {
        s = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int x = s.nextInt();

        double numeros[] = new double[x];

        ler(numeros);
        lerOutroValor(numeros);

        s.close();
    }

    public void ler(double[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = s.nextDouble();
        }
    }

    public void lerOutroValor(double[] numeros) {
        System.out.println("Informe mais um valor");
        double numero = s.nextDouble();

        int contador = 0;

        for (double num : numeros) {
            if (num == numero) {
                contador++;
            }
        }

        if (contador != 0) {
            System.out.println("O valor se encontra no array");
        } else {
            System.out.println("O valor não se encontra no array");
        }
    }

    public static void main(String[] args) {
        new Ex6();
    }
}
