public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    String isbn;
    boolean emprestado = false;
    
    Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }
}