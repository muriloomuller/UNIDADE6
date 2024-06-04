import java.util.Scanner;

public class ex {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o tamanho do vetor? ");
        int n = scan.nextInt();

        while (n > 50) {
            System.out.println("Tamanho inválido, digite novamente");
            n = scan.nextInt();
        }

        int[] vetor = new int[n]; //primeira posição sempre 0
        int op;
        int tamanho = 0;

        do {
            mostrarMenu();
            op = scan.nextInt();
            switch (op) {
                case 1:
                    inserir(vetor, n, scan, tamanho);
                    tamanho++;
                    break;
                case 2:
                    pesquisar(vetor, scan, tamanho);
                    break;
                case 3:
                    alterar(vetor, scan, tamanho);
                    break;
                case 4:
                    excluir(vetor, scan, tamanho);
                    break;
                case 5:
                    mostrar(vetor, tamanho);
                    break;
                case 6:
                    ordenar(vetor, tamanho);
                    break;
                case 7:
                    inverter(vetor, tamanho);
                    break;
                case 8:
                    System.out.println("Saindo do sistema.");
                    break;

                default:
                    System.out.println("Número inválido");
                    break;
            }

        } while (op != 8);

        scan.close();
    }

    public static void mostrarMenu() {
        System.out.println("Escolha uma opcao: ");
        System.out.println("1 - Incluir valor");
        System.out.println("2 - Pesquisar valor");
        System.out.println("3 - Alterar valor");
        System.out.println("4 - Excluir valor");
        System.out.println("5 - Mostrar valores");
        System.out.println("6 - Ordenar valores");
        System.out.println("7 - Inverter valores");
        System.out.println("8 - Sair do sistema");
    }

    public static void inserir(int[] vetor, int n, Scanner scan, int tamanho) {
        if (tamanho < n) {
            System.out.println("Qual valor voce quer inserir? ");
            int valor = scan.nextInt();
            vetor[tamanho] = valor;
            System.out.println("Valor incluído no vetor");
        } else {
            System.out.println("Vetor cheio");
        }
    }

    public static void pesquisar(int[] vetor, Scanner scan, int tamanho) {
        System.out.println("Qual valor voce quer procurar? ");
        int temp = scan.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (temp == vetor[i]) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Encontrado");
        } else {
            System.out.println("Valor não encontrado");
        }
    }

    public static void alterar(int[] vetor, Scanner scan, int tamanho) {

        System.out.println("Qual valor voce quer alterar? ");
        int temp = scan.nextInt();

        System.out.println("Qual valor voce quer inserir? ");
        int in = scan.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (temp == vetor[i]) {
                vetor[i] = in;
                encontrado = true;
            }
            if (encontrado) {
                System.out.println("Valor alterado");
            } else {
                System.out.println("Valor não encontrado");
            }
        }
    }

public static void excluir(int[] vetor, Scanner scan, int tamanho) {

    System.out.println("Qual valor você deseja excluir");

        int ex = scan.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (ex == vetor[i]) {
                for (int j = i; j < tamanho- 1; j++) {
                    vetor [j] = vetor [j+1];     
                }
                encontrado = true;
                break;
            }
        }

    if (encontrado) {
        tamanho --;
        System.out.println("Valor excluído");
    } else {
        System.out.println("Valor não encontrado");
    }

}
public static void mostrar(int[] vetor, int tamanho) {
    for (int i = 0; i < tamanho; i++) {
        System.out.print(vetor[i] + " ");
    }
    System.out.println();
}

public static void ordenar(int[] vetor, int tamanho) {
    for (int i = 0; i < tamanho - 1; i++) { //-1 aplicavel pois em outro for(j) ele tenta acessar o j + 1, sem o -1 ele tentaria acessar uma posição inexistente, ex tamanho  = 7 j = 6 + 1 não existiria 
        for (int j = 0; j < tamanho - 1 - i; j++) {
            if (vetor[j] > vetor[j+1]) {
                int temp = vetor[j];
                vetor[j] = vetor[j+1];
                vetor[j+1] = temp; 
            }
        }
    }
}

public static void inverter(int[] vetor, int tamanho) {
    for (int i = 0; i < tamanho / 2; i++) {
        int temp = vetor[i];
        vetor[i] = vetor[tamanho- 1 - i];
        vetor[tamanho - 1 - i] = temp;


    }


}
}