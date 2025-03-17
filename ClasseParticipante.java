package classeparticipante;

public class ClasseParticipante {

    public static void main(String[] args) {
        Participante participante1 = new Participante();

        participante1.setEmail("alice@example.com");
        participante1.exibirInformacoes();

        Participante participante2 = new Participante(
                "Bruno Lima",
                "bruno.lima@example.com",
                "10/03/2025"
        );
        participante2.exibirInformacoes();

        participante1.setEmail("emailinvalido.com");
    }
}
