import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o valor em reais:");
            double reais = scanner.nextDouble();

            System.out.println("Escolha a moeda de destino (USD, EUR, GBP):");
            System.out.println("1 - USD - Dólar Americano");
            System.out.println("2 - EUR - Euro");
            System.out.println("3 - GBP - Libra Esterlina");
            int moeda = scanner.nextInt();

            double taxaUSD = 5.73;
            double taxaEUR = 5.99;
            double taxaGBP = 7.23;

            switch (moeda) {
                case 1:
                    System.out.printf("O valor em dólar é: %.2f", reais / taxaUSD);
                    break;
                case 2:
                    System.out.printf("O valor em euro é: %.2f", reais / taxaEUR);
                    break;
                case 3:
                    System.out.printf("O valor em libra é: %.2f", reais / taxaGBP);
                    break;
                default:
                    System.out.println("Opção inválida! Escolha 1 para USD, 2 para EUR ou 3 para GBP.");
            }

            scanner.close();
        }
        catch (InputMismatchException eInput) {
            System.out.println("Erro: Entrada inválida! Certifique-se de inserir um número." + eInput.getMessage());
        }
        catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

    }
}
