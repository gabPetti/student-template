import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();

        Livro l1 = new Livro(
            "O senhor dos Anéis",
            "J. R. Tokinho",
            1954,
            "123"
        );
        Livro l2 = new Livro(
            "O hobbit",
            "J. R. Tokinho",
            1937,
            "234"
        );
        Livro l3 = new Livro(
            "Dom Quixote",
            "Miguel servente",
            1605,
            "345"
        );
        Livro l4 = new Livro(
            "Guerra e dor",
            "josé de medeiros",
            1893,
            "456"
        );
        Livro l5 = new Livro(
            "não respire",
            "senhor jonas",
            2019,
            "567"
        );

        bib.adicionarLivro(l1);
        bib.adicionarLivro(l2);
        bib.adicionarLivro(l3);
        bib.adicionarLivro(l4);
        bib.adicionarLivro(l5);
        l1.emprestar();
        l2.emprestar();
        l3.emprestar();
        l1.devolver();
        
        ArrayList<Livro> livrus = bib.listaDisponiveis();
        for (Livro l : livrus) {
            System.out.println(l.titulo + ", by " + l.autor);
        }
    }
}
