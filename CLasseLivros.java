
package classelivros;


public class CLasseLivros {

 
    public static void main(String[] args) {
     Livro livro = new Livro("O Hobbit", "J.R.R. Tolkien");
        System.out.println("Livro: " + livro.getTitulo() + ", Disponível: " + livro.insDisponivel());
        livro.emprestar();
        System.out.println("Após empréstimo: " + livro.insDisponivel());
        livro.devolver();
        System.out.println("Após devolução: " + livro.insDisponivel());
    }
    
}
