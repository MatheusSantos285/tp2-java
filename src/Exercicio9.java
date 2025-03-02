import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastre uma senha:");
        String senha = scanner.nextLine();

        while (senha.isEmpty()) {
            System.out.println("Senha inválida! A senha não pode ser vazia. Cadastre uma senha:");
            senha = scanner.nextLine();
        }

        System.out.println("Digite a senha cadastrada:");
        String senhaDigitada = scanner.nextLine();

        while(!senha.equals(senhaDigitada)) {
            System.out.println("Senha incorreta. Digite novamente:");
            senhaDigitada = scanner.nextLine();
        }

        System.out.println("Senha correta! Acesso liberado.");
    }
}
