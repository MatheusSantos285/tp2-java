import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;

        boolean numeroCorreto = false;

        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número secreto entre 1 e 100.");

        while (!numeroCorreto) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 100) {
                System.out.println("O número deve estar entre 1 e 100.");
                continue;
            }

            if (numeroSecreto == numero) {
                System.out.println("Parabéns! Você acertou o número seceto.");
                numeroCorreto = true;
            } else if (numeroSecreto < numero) {
                System.out.println("O número secreto é menor!");
            } else {
                System.out.println("O número secreto é maior!");
            }
        }
    }
}
