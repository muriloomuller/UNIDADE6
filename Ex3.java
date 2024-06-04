import java.util.Scanner;

public class Ex3 {
    public Ex3() {
        double numeros[] = new double[12];

        ler(numeros);
        calcular(numeros);
        escrever(numeros);
    }

    public void ler(double[] numeros) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = s.nextDouble();
        }

        s.close();
    }

    public void calcular(double[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int resto = (i + 1) % 2;

            if (resto != 0) {
                numeros[i] *= 1.05;
            } else if (resto == 0) {
                numeros[i] *= 1.02;
            }
        }

    }

    public void escrever(double[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + " reajustado: " + numeros[i]);
        }
    }

    public static void main(String[] args) {
        new Ex3();
    }
}