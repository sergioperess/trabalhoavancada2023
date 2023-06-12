import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reconciliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número total de pontos de passagem: ");
        int numPontosPassagem = scanner.nextInt();

        List<Double> tempos = new ArrayList<>();
        tempos.add(0.0); // Tempo total inicial

        for (int i = 1; i <= numPontosPassagem; i++) {
            System.out.print("Digite o tempo estimado para o ponto de passagem " + i + ": ");
            double tempoEstimado = scanner.nextDouble();

            double tempoAnterior = tempos.get(i - 1);
            double atrasoOuAdiantamento = calcularAtrasoOuAdiantamento();
            double novoTempo = tempoAnterior - (0.75 + atrasoOuAdiantamento);
            tempos.add(novoTempo);
        }

        System.out.println("Tempos reconciliados:");
        for (int i = 1; i <= numPontosPassagem; i++) {
            System.out.println("Ponto de passagem " + i + ": " + tempos.get(i));
        }
    }

    private static double calcularAtrasoOuAdiantamento() {
      
        // Por simplicidade, este método retorna sempre 0.
        return 0.0;
    }
}
