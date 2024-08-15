public class B extends A {
    private int x = 20;

    public int m1() {
        return x; // Se não colocar nada ele sempre chama o this, então seria this.x
    }

    public int m2() {
        return super.x;
    }

    public static void main(String args[]) {
        B b = new B();
        System.out.println(b.m1());
        System.out.println(b.m2());
    }
}
