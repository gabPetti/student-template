import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inteiro: ");
        int i = scanner.nextInt();
        System.out.print("Boolean: ");
        boolean b = scanner.nextBoolean();
        System.out.print("Double: ");
        double d = scanner.nextDouble();
        System.out.print("String: ");
        String s = scanner.next();
        scanner.close();

        System.out.println(i);
        System.out.println(b);
        System.out.println(d);
        System.out.println(s);
    }
}
