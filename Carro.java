public class Carro {
    private double velocidade;
    private double tempoGasto; // gasto em minutos
    private double RPM;
    private double custoCombustivel;
    private double consumoCombustivel;
    private double consumoMedio;
    private double distanciaPercorrida;
    private Combustivel combustivel;

    public Carro() {
        velocidade = 0;
        tempoGasto = 0;
        RPM = 0;
        custoCombustivel = 0;
        consumoCombustivel = 0;
        consumoMedio = 0;
        distanciaPercorrida = 0;
        combustivel = null;
    }

    public void setTempoGasto(double tempoGasto) {
        this.tempoGasto = tempoGasto;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    // Calculo RPM
    public double calculaRPM(double RPM) {
        double novoRPM = 0;
        novoRPM = (velocidade * 3800) / 120;
        return novoRPM;
    }

    // Calculo do tempo utilizando a velocidade
    public double tempoGastoVel() {
        double dist = getDistanciaPercorrida();
        double vel = getVelocidade();
        tempoGasto = dist / vel;
        return tempoGasto;
    }

    // Calculo do custo de combustivel (Gasolina)
    public double custoGasol() {
        double preço = combustivel.getGasolina();
        custoCombustivel = preço * consumoTotal();
        return custoCombustivel;
    }

    // Calculo do custo de combustivel (Etanol)
    public double custoEtanol() {
        double preço = combustivel.getEtanol();
        custoCombustivel = preço * consumoTotal();
        return custoCombustivel;
    }

    // Calculo do tempo gasto
    public double tempoGasto() {
        double tempoHora;
        tempoGasto = (120 * 100) / velocidade;
        tempoHora = tempoGasto / 60;
        return tempoHora;
    }

    // Calculo custo do combustivel
    public double custoCom() {
        custoCombustivel = (velocidade * 43.26) / 120;
        return custoCombustivel;
    }

    // Calculo do consumo total
    public double consumoTotal() {
        consumoCombustivel = (velocidade * 19.23) / 120;
        return consumoCombustivel;
    }

    // Calculo do consumo médio
    public double consumoMedio() {
        consumoMedio = (120 * 10.4) / velocidade;
        return consumoMedio;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public double getCustoCombustivel() {
        return custoCombustivel;
    }

    public double getRPM() {
        return RPM;
    }

    public double getTempoGasto() {
        return tempoGasto;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setTempoDeslocamento(int i) {
    }

    public void setDistanciaPercorrida(int i) {
    }
}
