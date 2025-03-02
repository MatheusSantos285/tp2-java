import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor da compra (R$):");
        double valorDaCompra = scanner.nextDouble();

        double desconto = 0;
        double valorFinal = valorDaCompra;

        if (valorDaCompra > 1000) {
            desconto = 0.1 * valorDaCompra;
        } else if (valorDaCompra > 500 && valorDaCompra <= 1000) {
            desconto = 0.05 * valorDaCompra;
        }
        valorFinal = valorDaCompra - desconto;

        System.out.printf("Valor da compra sem desconto: R$ %.2f%n", valorDaCompra);
        if (desconto > 0) {
            System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);
        } else {
            System.out.println("A compra não possui desconto.");
        }
        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
