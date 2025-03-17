
package classesensor;


public class SensorTemperatura extends Sensor{
     private String unidade; 

    public SensorTemperatura(String localizacao, String unidade) {
        super(localizacao);
        this.unidade = unidade;
    }

  
    public String getUnidade() {
        return unidade;
    }

    
    @Override
    public double coletarDado() {
        return 25.5;
    }
}
