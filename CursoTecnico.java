
package classemain;


public class CursoTecnico extends Curso implements Certificavel{
     private String modalidade; 

    public CursoTecnico(String nome, String endereco, int cargaHoraria, String modalidade) {
        super(nome, endereco, cargaHoraria);
        this.modalidade = modalidade;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Modalidade: " + modalidade);
    }
    
    @Override
    public double calcularMensalidade() {
        return super.calcularMensalidade() * 1.2; 
    }
      @Override
    public void emitirCertificado() {
        System.out.println("Certificado emitido para o curso técnico: " + nome + " - Modalidade: " + modalidade);
    }
}
