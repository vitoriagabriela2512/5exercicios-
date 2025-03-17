package classesensor;

public class SensorUmidade extends Sensor {

    private int precisao;

    public SensorUmidade(String localizacao, int precisao) {
        super(localizacao);
        this.precisao = precisao;
    }

    public int getPrecisao() {
        return precisao;
    }

    @Override
    public double coletarDado() {
        return 60.0;
    }

}
