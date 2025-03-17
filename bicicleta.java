
package classeequipamento;


public  class bicicleta extends equipamento{
    private String tipo;
   
    public bicicleta(String nome, double precoAluguel, String tipo) {
        super(nome, precoAluguel);
        this.tipo = tipo;
    }

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  
    @Override
    public int definirDurabilidade() {
        return 50;
    }
}
