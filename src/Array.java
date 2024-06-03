public class Array {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        double[] reais = {1.0, 2.0, 3.0, 4.0};

        System.out.println(numeros[1]);
        System.out.println(reais[2]);
        System.out.println(numeros[1]);
        System.out.println("Sente a pressão\n\n");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}