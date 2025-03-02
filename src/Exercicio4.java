import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite a sua data de nascimento (no formato dd/mm/aaaa):");
            String dataNascimentoStr = scanner.next();

            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            LocalDate dataAtual = LocalDate.now();

            // Calcula a diferença entre duas datas em dias e já considera os anos bissextos.
            long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

            System.out.println("Você tem " + idadeEmDias + " dias de vida.");
        }
        catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido! Certifique-se de digitar a data no formato dd/mm/aaaa.");
        }
        catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
