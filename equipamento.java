
package classeequipamento;


public abstract class equipamento {
    private String nome;
   double precoAluguel;
        public equipamento(String nome, double precoAluguel) {
        this.nome = nome;
        this.precoAluguel = precoAluguel;
    }

 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    public abstract int definirDurabilidade();
}
