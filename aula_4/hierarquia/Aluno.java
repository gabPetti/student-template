class Aluno {
    String nome;
    int ra;
    int anoNascimento;

    Aluno(String nome, int ra, int anoNascimento) {
        this.nome = nome;
        this.ra = ra;
        this.anoNascimento = anoNascimento;
    }

    public String toString() {
        return "Nome: " + nome + ", RA: " + ra + ", Ano de Nascimento: " + anoNascimento;
    }
}