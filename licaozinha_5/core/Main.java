public class Main {
    public static void main(String[] args) {
        Matrix a = new Matrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        Matrix b = new Matrix(new double[][]{
            {12, 10, 8},
            {7, 6, 5},
            {4, 3, 2}
        });

        Matrix c = new Matrix(new double[][]{
            {3, 6},
            {8, 1},
            {4, 2}
        });

        Matrix d = new Matrix(new double[][]{
            {1, 2, 3, 4},
            {2, 1, 5, 6},
            {3, 5, 9, 7},
            {4, 6, 7, 8}
        });

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a.plus(b));
        System.out.println(a.minus(b));
        System.out.println(a.times(b));
        System.out.println(a.times(2));
        System.out.println(b.isSquare());
        System.out.println(d.isSymmetric());
        System.out.println(c.getTranspose());
    }
}
