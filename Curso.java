
package classemain;


public class Curso extends Escola implements Certificavel{
     protected int cargaHoraria;

    public Curso(String nome, String endereco, int cargaHoraria) {
        super(nome, endereco);
        setCargaHoraria(cargaHoraria);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0) {
            this.cargaHoraria = cargaHoraria;
        } else {
            System.out.println("A carga horária deve ser maior que zero.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
    }
    
    @Override
    public double calcularMensalidade() {
        return cargaHoraria * 10.0; // Exemplo: R$10 por hora
    }

     @Override
    public void emitirCertificado() {
        System.out.println("Certificado emitido para o curso: " + nome);
    }
}
