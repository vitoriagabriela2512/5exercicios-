package classeparticipante;

public class Participante {

    private String nomeCompleto;
    private String email;
    private String datainscricao;

    public Participante(String nomeCompleto, String datainscricao) {
        this.nomeCompleto = nomeCompleto;
        this.datainscricao = "12/03/2025";
    }

    public Participante() {
    }

    public Participante(String nomeCompleto, String datainscricao, String email) {
        this.datainscricao = datainscricao;
        this.setEmail(email);
        this.datainscricao = datainscricao;
    }

   

    

    public String getNome() {
        return this.nomeCompleto;
    }

    public String getEmail() {
        return this.email;
    }

    public String getData() {
        return this.datainscricao;
    }
//
//    public void setNome(String nome) {
//        this.nomeCompleto = nome;
//    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email inválido. Deve conter '@'.");
        }
    }

//    public void setData(String data) {
//        this.datainscricao = data;
//    }

    public void exibirInformacoes() {
//        System.out.println("Nome Completo: " + nomeCompleto);
//        System.out.println("Email: " + (email != null ? email : "Não informado"));
//        System.out.println("Data de Inscrição: " + datainscricao);
//        System.out.println("-----------------------------");
 System.out.println("Nome: " + nomeCompleto);
    System.out.println("Email: " + email);
    System.out.println("Data de Inscrição: " + datainscricao);
    System.out.println("-----------------------------");
    }

}
