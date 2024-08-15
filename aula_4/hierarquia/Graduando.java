class Graduando extends Aluno {
    int anoIngresso;
    String curso;

    Graduando(String nome, int ra, int anoNascimento, int anoIngresso, String curso) {
        super(nome, ra, anoNascimento);
        this.anoIngresso = anoIngresso;
        this.curso = curso;
    }

    public String toString() {
        return super.toString() + ", Ano de Ingresso: " + anoIngresso + ", Curso: " + curso;
    }

    public static void main(String args[]) {
        Graduando g = new Graduando("João", 123, 1990, 2010, "Computação");
        System.out.println(g);
    }
}