import java.util.Locale;

public class SaidaDados {
    static class Person {
        String nome, sobrenome;
        int idade;
        double saldo;

        public Person(String cnome, String csobrenome, int cidade, double csaldo) {
            nome = cnome;
            sobrenome = csobrenome;
            idade = cidade;
            saldo = csaldo;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Maria", "Silva", 18, 0.58);

        System.out.printf("Nome: %s %s\n", person.nome, person.sobrenome);
        System.out.printf("Idade: %d\n", person.idade);
        System.out.printf(Locale.FRENCH, "Você tem %.2f na conta. Pobre coitada\n", person.saldo);
    }
}
