import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> acervo;

    Biblioteca() {
        acervo = new ArrayList<Livro>();
    }

    void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    boolean removerLivro(String isbn) {
        for (Livro livro : acervo) {
            if (livro.isbn.equals(isbn) == true) {
                acervo.remove(livro);
                return true;
            }
        }
        return false;
    }

    ArrayList<Livro> listaEmprestados() {
        ArrayList<Livro> temp = new ArrayList<Livro>();
        for (Livro livro : acervo) {
            if (livro.emprestado) {
                temp.add(livro);
            }
        }
        return temp;
    }

    ArrayList<Livro> listaDisponiveis() {
        ArrayList<Livro> temp = new ArrayList<Livro>();
        for (Livro livro : acervo) {
            if (livro.emprestado == false) {
                temp.add(livro);
            }
        }
        return temp;
    }
}