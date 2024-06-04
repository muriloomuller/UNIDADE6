import java.util.Scanner;

public class Ex8 {
    private double[] valores;
    private int tamanho;

    public Ex8() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Informe o valor de N (1 a 20): ");
            tamanho = scanner.nextInt();
        } while (tamanho < 1 || tamanho > 20);

        valores = new double[tamanho];
        lerValores();
        imprimirFrequencias();
    }

    public void lerValores() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o valor para a posição " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }
    }

    public void imprimirFrequencias() {
        double[] valoresDistintos = new double[tamanho];
        int[] frequencias = new int[tamanho];
        int contadorDistintos = 0;

        for (int i = 0; i < tamanho; i++) {
            boolean encontrado = false;
            for (int j = 0; j < contadorDistintos; j++) {
                if (valores[i] == valoresDistintos[j]) {
                    frequencias[j]++;
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                valoresDistintos[contadorDistintos] = valores[i];
                frequencias[contadorDistintos] = 1;
                contadorDistintos++;
            }
        }

        System.out.println("VALOR\tFREQUÊNCIA");
        for (int i = 0; i < contadorDistintos; i++) {
            System.out.printf("%.2f\t%d\n", valoresDistintos[i], frequencias[i]);
        }
    }

    public static void main(String[] args) {
        new Ex8();
    }
}
