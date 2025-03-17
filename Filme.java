package classeprojeto;

public class Filme extends Projeto {

    private int duracaoMinutos;

    public Filme(String titulo, String dataInicio, double orcamento, int duracaoMinutos) {
        super(titulo, dataInicio, orcamento);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public int calcularPrazo() {
        return duracaoMinutos / 10;
    }
}
