public class Hardware {
    String tipo;   // Tipo de dispositivo (ex: Processador Core i5)
    int capacidade; // Capacidade do dispositivo (ex: 4GB, 1200 MHz)

    public Hardware(String tipo, int capacidade) {
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return tipo + " - " + capacidade;
    }
}
