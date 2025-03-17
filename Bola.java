package classeequipamento;

public class Bola extends equipamento {

    private String material;

    public Bola(String nome, double precoAluguel, String material) {
            super(nome, precoAluguel);
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

  
    @Override
    public int definirDurabilidade() {
        return 20; 
    }
    }
