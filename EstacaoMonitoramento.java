package classesensor;

import java.util.ArrayList;

public class EstacaoMonitoramento {

    private ArrayList<Sensor>  sensores;

    public EstacaoMonitoramento() {
        sensores = new ArrayList<>();
    }

    public void adicionarSensor(Sensor s) {
        sensores.add(s);
    }

    public void verificarEstado() {
        System.out.println("Estado da Estação de Monitoramento:");
        for (Sensor s : sensores) {
            if (s.getAtivo()) {
                System.out.println("Localização: " + s.getLocalizacao()
                        + "  Dado: " + s.coletarDado()
                        + "  Bateria: " + s.getNivelBateria() + "%");
            } else {
                System.out.println("Localização: " + s.getLocalizacao() + "  SENSOR INATIVO");
            }
        }
    }
}
