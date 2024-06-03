import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("\nInteiro: ");
        int i = scanner.nextInt();
        System.out.print("\nBoolean: ");
        boolean b = scanner.nextBoolean();
        System.out.print("\nDouble: ");
        double d = scanner.nextDouble();
        System.out.print("\nString: ");
        String s = scanner.next();

        System.out.println(i);
        System.out.println(b);
        System.out.println(d);
    }
}
