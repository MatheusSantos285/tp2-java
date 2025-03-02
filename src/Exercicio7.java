import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valor do seu salário bruto anual (R$): ");
        double salarioBrutoAnual = scanner.nextDouble();

        System.out.println("Digite o valor do desconto do INSS (R$): ");
        double descontoINSS = scanner.nextDouble();

        System.out.println("Digite o número de dependentes: ");
        int dependentes = scanner.nextInt();

        double deducaoDependentes = dependentes * 2275.08;

        double rendaTributavel = salarioBrutoAnual - descontoINSS - deducaoDependentes;

        double impostoDevido = calcularIRAnual(rendaTributavel);

        double salarioLiquidoAnual = salarioBrutoAnual - descontoINSS - impostoDevido;

        System.out.printf("\nImposto de Renda devido (anual): R$ %.2f%n", impostoDevido);
        System.out.printf("Salário líquido anual: R$ %.2f%n", salarioLiquidoAnual);
        }

    public static double calcularIRAnual(double rendaTributavel) {
        if (rendaTributavel <= 27110.40) return 0;

        double impostoDevido = 0;

        double[] faixas = {27110.40, 33919.80, 45012.60, 55976.16};
        double[] aliquotas = {0.075, 0.15, 0.225, 0.275};

        double valorAnterior = 0;
        for (int i = 0; i < faixas.length; i++) {
            if (rendaTributavel > faixas[i]) {
                double baseCalculo = Math.min(rendaTributavel, faixas[i]) - valorAnterior;
                impostoDevido += baseCalculo * aliquotas[i];
                valorAnterior = faixas[i];
            } else {
                impostoDevido += (rendaTributavel - valorAnterior) * aliquotas[i];
                break;
            }
        }

        return impostoDevido;
    }
}

