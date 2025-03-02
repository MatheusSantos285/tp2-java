import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome da sua mãe:");
        String nomeMae = sc.nextLine();

        System.out.println("Digite o nome do seu pai:");
        String nomePai = sc.nextLine();

        System.out.printf("Nome: %s%nIdade: %d%nNome da mãe: %s%nNome do pai: %s%n", nome, idade, nomeMae, nomePai);
        //String nomeMaisLongo = nomeMae.length() > nomePai.length() ? nomeMae : nomePai;

        if (nome.length() > nomeMae.length() && nome.length() > nomePai.length()) {
            System.out.println("Seu nome é maior que o nome dos seus pais.");
        } else if (nome.length() > nomeMae.length()) {
            System.out.println("Seu nome é maior que o nome da sua mãe, mas não é maior que o nome do seu pai.");
        } else if (nome.length() > nomePai.length()) {
            System.out.println("Seu nome é maior que o nome do seu pai, mas não é maior que o nome da sua mãe.");
        } else {
            System.out.println("Seu nome não é maior que o nome dos seus pais.");
        }
        sc.close();
    }
}
