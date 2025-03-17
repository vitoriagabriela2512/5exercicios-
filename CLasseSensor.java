
package classesensor;


public class CLasseSensor {

   
    public static void main(String[] args) {
        EstacaoMonitoramento estacao = new EstacaoMonitoramento();

        
        SensorTemperatura tempSensor = new SensorTemperatura("Sala 1", "Celsius");
        SensorUmidade umidadeSensor = new SensorUmidade("Jardim", 2);

      
        estacao.adicionarSensor(tempSensor);
        estacao.adicionarSensor(umidadeSensor);

       
        tempSensor.setNivelBateria(50);
        umidadeSensor.setNivelBateria(0); 

      
        estacao.verificarEstado();
    }
    }
    

