import java.util.Scanner;

public class Ex2 {
    public Ex2() {
        double numeros[] = new double[12];

        ler(numeros);
        double media = calcularmedia(numeros);
        escrever(numeros, media);
    }

    public void ler(double[] numeros) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = s.nextDouble();
        }
        s.close();
    }

    public double calcularmedia(double[] numeros) {
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma / numeros.length;
    }

    public void escrever(double[] numeros, double media) {
        System.out.println("Números maiores do que a média (" + media + "):");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        new Ex2();
    }
}
