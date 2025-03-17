
package classeequipamento;


public class CLasseEquipamento {

  
    public static void main(String[] args) {
       bicicleta bicicleta = new bicicleta("Bicicleta Montanha", 100.0, "Montanha");
        Bola bola = new Bola("Bola de Futebol", 30.0, "Couro");

       
        System.out.println("Equipamento: " + bicicleta.getNome() + 
                           " | Tipo: " + bicicleta.getTipo() + 
                           " | Durabilidade: " + bicicleta.definirDurabilidade() + " horas");

        System.out.println("Equipamento: " + bola.getNome() + 
                           " | Material: " + bola.getMaterial() + 
                           " | Durabilidade: " + bola.definirDurabilidade() + " horas");
   
    }
    
}
