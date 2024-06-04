import java.util.Scanner;

public class Ex7 {

    public Ex7() {
        int numeros[] = new int[20];

        ler(numeros);
        organizar(numeros);
        imprimir(numeros);
    }

    public void ler(int[] numeros) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = s.nextInt();

            for (int j = 0; j < i; j++) {
                while (numeros[i] == numeros[j]) {
                    System.out.println("Número já está contido no array");
                    System.out.println("Digite outro número");
                    numeros[i] = s.nextInt();
                    j = 0;
                }
            }
        }

        s.close();
    }

    public void organizar(int[] numeros) {
        int n = numeros.length;
        for (int a = 0; a < n - 1; a++) {
            for (int i = 0; i < n - 1 - a; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int bolha = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = bolha;
                }
            }
        }
    }

    public void imprimir(int[] numeros) {
        System.out.println("Array ordenado:");
        for (int i = 0; i < numeros.length;i++) {
            System.out.print("[ " + numeros[i] + " ]" + " ");
        }
    }

    public static void main(String[] args) {
        new Ex7();
    }
}
