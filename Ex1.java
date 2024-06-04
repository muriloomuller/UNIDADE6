import java.util.Scanner;

public class Ex1 {
    public Ex1() {

        int numeros[] = new int[10];

        ler(numeros);
        escrever(numeros);

    }

    private void ler(int[] numeros) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            numeros[i] = s.nextInt();
        }
        s.close();
    }

    public void escrever(int[] numeros) {
        for (int a = numeros.length - 1; a >= 0; a--) {
            System.out.print(numeros[a] + " ");
        }
    }

    public static void main(String[] args) {
        new Ex1();
    }
}


