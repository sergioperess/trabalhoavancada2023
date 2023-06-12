import java.util.Date;

public class Localizacao {
    private int identificador;
    private double latitude;
    private double longitude;
    private long timestamp;

    public Localizacao(int identificador, double latitude, double longitude) {
        this.identificador = identificador;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = new Date().getTime();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}