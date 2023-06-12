import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Definição dos pontos de passagem e seus tempos esperados
        Map<String, Integer> pontosPassagem = new HashMap<>();
        pontosPassagem.put("Ponto A", 10); // Ponto A - Tempo esperado: 10 minutos
        pontosPassagem.put("Ponto B", 20); // Ponto B - Tempo esperado: 20 minutos
        pontosPassagem.put("Ponto C", 30); // Ponto C - Tempo esperado: 30 minutos

        // Dados de tempo de chegada em cada ponto de passagem (em minutos)
        Map<String, Integer> temposChegada = new HashMap<>();
        temposChegada.put("Ponto A", 12); // Ponto A - Tempo de chegada: 12 minutos
        temposChegada.put("Ponto B", 28); // Ponto B - Tempo de chegada: 28 minutos
        temposChegada.put("Ponto C", 42); // Ponto C - Tempo de chegada: 42 minutos

        // Determinação da velocidade em cada ponto de passagem
        for (String ponto : pontosPassagem.keySet()) {
            if (temposChegada.containsKey(ponto)) {
                int tempoEsperado = pontosPassagem.get(ponto);
                int tempoChegada = temposChegada.get(ponto);
                double velocidade = calcularVelocidade(tempoEsperado, tempoChegada);
                System.out.println("Velocidade em " + ponto + ": " + velocidade + " km/h");
            } else {
                System.out.println("Dados de chegada não disponíveis para " + ponto);
            }
        }
    }

    private static double calcularVelocidade(int tempoEsperado, int tempoChegada) {
        double distancia = calcularDistancia(); // Calcular a distância entre os pontos de passagem
        double tempoGasto = tempoChegada - tempoEsperado; // Tempo gasto além do esperado
        double velocidade = distancia / (tempoGasto / 60); // Velocidade em km/h
        return velocidade;
    }

    private static double calcularDistancia() {
        // Observar a distancia entre os pontos na API
    
        // Para simplificar retornaremos um valor fixo de distância
        return 20.0; // Distância entre os pontos de passagem em km
    }
}
