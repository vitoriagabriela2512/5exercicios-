
package classeprojeto;


public class ClasseProjeto {

   
    public static void main(String[] args) {
        Filme filme = new Filme("Aventura Épica", "2025-03-15", 500000.00, 120);
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Prazo estimado: " + filme.calcularPrazo() + " dias");

       
        Musica musica = new Musica("Sinfonia Fantástica", "2025-03-10", 20000.00, 300);
        System.out.println("Música: " + musica.getTitulo());
        System.out.println("Prazo estimado: " + musica.calcularPrazo() + " dias");
    }
    
    
}
