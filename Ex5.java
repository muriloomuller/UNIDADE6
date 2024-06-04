import java.util.Scanner;

public class Ex5 {
    private Scanner s;

    public Ex5() {
        s = new Scanner(System.in);

        char respostasRapaz[] = new char[5];
        char respostasMoca[] = new char[5];
        int contadorAfinidade;

        armazenarRapaz(respostasRapaz);
        armazenarMoca(respostasMoca);
        contadorAfinidade = lerRespostas(respostasMoca, respostasRapaz);
        calcularAfinidade(contadorAfinidade);

        s.close();
    }

    public void armazenarRapaz(char respostasRapaz[]) {
        System.out.println("RAPAZ");
        System.out.println("USE SIM, NÃO OU INDIFERENTE");

        System.out.println("Gosta de música sertaneja?");
        respostasRapaz[0] = s.next().toUpperCase().charAt(0);

        System.out.println("Gosta de futebol?");
        respostasRapaz[1] = s.next().toUpperCase().charAt(0);

        System.out.println("Gosta de seriados?");
        respostasRapaz[2] = s.next().toUpperCase().charAt(0);

        System.out.println("Gosta de redes sociais?");
        respostasRapaz[3] = s.next().toUpperCase().charAt(0);

        System.out.println("Gosta da Oktoberfest?");
        respostasRapaz[4] = s.next().toUpperCase().charAt(0);
    }

    public void armazenarMoca(char respostasMoca[]) {
        System.out.println("MOÇA");
        System.out.println("USE SIM, NÃO OU INDIFERENTE");

        System.out.println("Gosta de música sertaneja?");
        respostasMoca[0] = s.next().toUpperCase().charAt(0);

        System.out.println("Gosta de futebol?");
        respostasMoca[1] = s.next().toUpperCase().charAt(0);

        System.out.println("Gosta de seriados?");
        respostasMoca[2] = s.next().toUpperCase().charAt(0);

        System.out.println("Gosta de redes sociais?");
        respostasMoca[3] = s.next().toUpperCase().charAt(0);

        System.out.println("Gosta da Oktoberfest?");
        respostasMoca[4] = s.next().toUpperCase().charAt(0);
    }

    public int lerRespostas(char respostasMoca[], char respostasRapaz[]) {
        int contadorAfinidade = 0;
        for (int i = 0; i < respostasMoca.length; i++) {
            if (respostasMoca[i] == respostasRapaz[i]) {
                contadorAfinidade += 3;
            } else if (respostasMoca[i] == 'I' || respostasRapaz[i] == 'I') {
                contadorAfinidade += 1;
            } else {
                contadorAfinidade -= 2;
            }
        }
        return contadorAfinidade;
    }

    public void calcularAfinidade(int contadorAfinidade) {
        if (contadorAfinidade == 15) {
            System.out.println("Casem!");
        } else if (contadorAfinidade >= 10 && contadorAfinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (contadorAfinidade >= 5 && contadorAfinidade <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (contadorAfinidade >= 0 && contadorAfinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (contadorAfinidade >= -9 && contadorAfinidade <= -1) {
            System.out.println("Melhor não perder tempo");
        } else if (contadorAfinidade <= -10) {
            System.out.println("Vocês se odeiam!");
        }
    }

    public static void main(String[] args) {
        new Ex5();
    }
}
