import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um frase: ");
        String frase = scanner.nextLine();

        String regex = "[,\\.\\s]";

        String[] meuArray = frase.split(regex);

        int numPalavras = 0;

        for (String palavra : meuArray) {
            numPalavras++;
        }

        System.out.println("A frase contém " + numPalavras + " palavras.");
    }
}
