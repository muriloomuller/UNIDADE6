import java.util.Scanner;

public class Ex4 {
    public Ex4() {
        int numero1[] = new int[10];
        int numero2[] = new int[10];
        
        
        ler(numero1, numero2);
        somar(numero1, numero2);
        int[] soma = somar(numero1, numero2);
        escrever(soma);
    }

    private void ler(int numero1[], int numero2[]) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < numero1.length; i++) {
            System.out.println("Digite o numero " + (i + 1) + " (Primeiro array)");
            numero1[i] = s.nextInt();
        }
        for (int i = 0; i < numero2.length; i++) {
            System.out.println("Digite o numero " + (i + 1) + " (Segundo array)");
            numero2[i] = s.nextInt();
        }
        s.close();
        

    }
    private int[] somar(int[] numero1, int numero2[]){

        int soma[] = new int[10];

        for(int i = 0; i < numero1.length; i++){
            soma[i] = numero1[i] + numero2[i]; 
            

        }
        return soma;
    }
    private int[] escrever(int[] soma){
        for(int i = 0; i < soma.length; i++){
            System.out.println("Soma " + (i + 1) + " -> " + soma[i]);
        }
        return soma;
        
    }

    public static void main(String[] args) {
        new Ex4();
    }
}
