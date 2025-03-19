
package classemain;
//9 e 10
interface Certificavel {
    void emitirCertificado();
}
public class ClasseMain {

    public static void main(String[] args) {
          Curso curso = new Curso("Matemática", "Rua A, 123", 40);
        CursoTecnico cursoTecnico = new CursoTecnico("Programação", "Rua B, 456", 60, "Online");
        
        System.out.println("--- Informações do Curso ---");
        curso.exibirInformacoes();
        System.out.println("Mensalidade: R$" + curso.calcularMensalidade());
        curso.emitirCertificado();

        System.out.println("\n--- Informações do Curso Técnico ---");
        cursoTecnico.exibirInformacoes();
        System.out.println("Mensalidade: R$" + cursoTecnico.calcularMensalidade());
        cursoTecnico.emitirCertificado();
    }
    }
    

