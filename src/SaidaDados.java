import java.util.Locale;

public class SaidaDados {
    public static void main(String[] args) {
        String nome = "Maria";
        String sobrenome = "Silva";
        int idade = 18;
        double saldo = 0.58;

        System.out.println("Nome");
        System.out.println("Idade: %d");
        System.out.println(Locale.FRENCH, "Você tem %.2f na conta. Pobre fudida\n", saldo);
    }
}
