public class Matrix {
    private double[][] cells;

    public Matrix(double[][] c) {
        this.cells = c.clone();
    }

    /*
     * Retornam a quantidade de linhas da matriz.
     * 
     * @return número de linhas da matriz.
     */
    public int getRows() {
        return cells.length;
    }

    /*
     * Retorna a quantidade de colunas da matriz.
     */
    public int getColumns() {
        return cells[0].length;
    }

    public double getAt(int i, int j) {
        if (i >= cells.length || j >= cells[0].length) {
            throw new IllegalArgumentException("Pode não, malandrão");
        }
        return cells[i][j];
    }

    public Matrix plus(Matrix m) {
        Matrix mam = new Matrix(new double[cells.length][cells[0].length]);
        for (int i = 0; i < mam.getRows(); i++) {
            for (int j = 0; j < mam.getColumns(); j++) {
                mam = this.getAt(i, j) + m.getAt(i, j);
            }
        }
        
        return d.toString();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (double[] line : cells) {
            for (double col : line) {
                str.append(String.format("%.6f ", col));
            }
            str.append('\n');
        }

        return str.toString();
    }
}