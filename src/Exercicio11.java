import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        System.out.println("Digite o valor a ser incrementado:");
        int incremento = scanner.nextInt();

        if (incremento <= 0) {
            System.out.println("O incremento deve ser um número positivo.");
            return;
        }

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = numero; i <= 100; i += incremento) {
            numeros.add(i);
        }

        String resultado = numeros.stream().map(String::valueOf).collect(Collectors.joining(", "));

        System.out.println(resultado);
    }
}
