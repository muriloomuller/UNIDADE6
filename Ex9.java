import java.util.Scanner;

public class Ex9 {
     final int NUM_CLIENTES = 30;
     int[] sexo = new int[NUM_CLIENTES];
     int[] notas = new int[NUM_CLIENTES];
     int[] idades = new int[NUM_CLIENTES];

    public Ex9() {
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < NUM_CLIENTES; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.print("Sexo (1=feminino, 2=masculino): ");
            sexo[i] = s.nextInt();
            System.out.print("Nota (0-10): ");
            notas[i] = s.nextInt();
            System.out.print("Idade: ");
            idades[i] = s.nextInt();
        }
        
        exibirResultados();
        s.close();
    }

    public void exibirResultados() {
        double notaMedia = calcularNotaMedia();
        System.out.println("Nota média do cinema: " + notaMedia);

        double notaMediaHomens = calcularNotaMediaHomens();
        System.out.println("Nota média atribuída pelos homens: " + notaMediaHomens);

        int notaMulherMaisJovem = notaMulherMaisJovem();
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);

        int mulheresMais50NotaSuperiorMedia = contarMulheresMais50NotaSuperiorMedia(notaMedia);
        System.out.println("Número de mulheres com mais de 50 anos que deram nota superior à média: " + mulheresMais50NotaSuperiorMedia);
    }

    public double calcularNotaMedia() {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return (double) soma / notas.length;
    }

    public double calcularNotaMediaHomens() {
        int soma = 0;
        int contagem = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 2) {
                soma += notas[i];
                contagem++;
            }
        }
        return contagem == 0 ? 0 : (double) soma / contagem;
    }

    public int notaMulherMaisJovem() {
        int menorIdade = Integer.MAX_VALUE;
        int notaMaisJovem = -1;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 1 && idades[i] < menorIdade) {
                menorIdade = idades[i];
                notaMaisJovem = notas[i];
            }
        }
        return notaMaisJovem;
    }

    public int contarMulheresMais50NotaSuperiorMedia(double notaMedia) {
        int contagem = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 1 && idades[i] > 50 && notas[i] > notaMedia) {
                contagem++;
            }
        }
        return contagem;
    }

    public static void main(String[] args) {
        new Ex9();
    }
}