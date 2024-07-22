public class TiposPrimitivos {
    public static void main(String[] args) {
        byte a = 0b10;      // 1 byte
        short b = 0xff;     // 2 bytes
        int c = 10;         // 4 bytes
        long d = 10000000;  // 8 bytes

        float e = 10.0f;    // 4 bytes
        double f = 20.0;    // 8 bytes

        boolean g = true;   // 1 byte
        char h = 'h';       // 2 bytes

        System.out.printf("- Byte: %d;%n- Short: %d;%n- Int: %d;%n- Long: %,d;%n- Float: %f;%n- Double: %f;%n- Boolean: %b;%n- Char: %s;%n", a, b, c, d, e, f, g, h);
    }
}