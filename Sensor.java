
package classesensor;


public abstract class Sensor {
     private String localizacao;
    private int nivelBateria;
    private boolean ativo;

 
    public Sensor(String localizacao) {
        this.localizacao = localizacao;
        this.nivelBateria = 100; 
        this.ativo = true;       
    }
public String getLocalizacao() {
        return localizacao;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public boolean getAtivo() {
        return ativo;
    }

       public void setNivelBateria(int nivelBateria) {
        if (nivelBateria <= 0) {
            this.nivelBateria = 0;
            this.ativo = false; 
        } else if (nivelBateria > 100) {
            this.nivelBateria = 100;
        } else {
            this.nivelBateria = nivelBateria;
        }
}
         public abstract double coletarDado();
}