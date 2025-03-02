import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado do triângulo:");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o valor do segundo lado do triângulo:");
        double lado2 = scanner.nextDouble();

        System.out.println("Digite o valor do terceiro lado do triângulo:");
        double lado3 = scanner.nextDouble();

        boolean isTriangulo = lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;

        if (isTriangulo) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        }
        else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        scanner.close();
    }
}
