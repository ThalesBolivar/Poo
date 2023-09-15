package Investimento;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do investimento inicial: R$");
        double investimentoInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de rendimento mensal (em %): ");
        double taxaRendimento = scanner.nextDouble();

        System.out.print("Digite o número de meses do investimento: ");
        int numeroMeses = scanner.nextInt();

        Investimento investimento = new Investimento(investimentoInicial, taxaRendimento, numeroMeses);
        investimento.calcularRendimento();

        scanner.close();
    }
}