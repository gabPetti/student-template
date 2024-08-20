public class Matrix {
    private final double[][] cells;

    public Matrix(double[][] c) {
        double[][] mam = new double[c.length][c[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                mam[i][j] = c[i][j];
            }
        }
        this.cells = mam;
    }

    /**
     * Retorna a matriz em forma de array.
     * 
     * @return matriz em forma de array.
     */
    public double[][] toArray() {
        double[][] mam = new double[cells.length][cells[0].length];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                mam[i][j] = cells[i][j];
            }
        }
        return mam;
    }

    /**
     * Retornam a quantidade de linhas da matriz.
     * 
     * @return numero de linhas da matriz.
     */
    public int getRows() {
        return cells.length;
    }

    /**
     * Retorna a quantidade de colunas da matriz.
     * 
     * @return numero de colunas da matriz.
     */
    public int getColumns() {
        return cells[0].length;
    }

    public double getAt(int i, int j) {
        if (i >= cells.length || j >= cells[0].length || i < 0 || j < 0) {
            throw new IllegalArgumentException("Nao pode nao, malandrao");
        }
        return cells[i][j];
    }

    /**
     * Retorna a matriz resultante da soma de duas matrizes.
     * 
     * @param m - matriz que sera somada com a matriz atual.
     * @return matriz resultante da soma.
     */
    public Matrix plus(Matrix m) {
        Matrix mam = new Matrix(new double[cells.length][cells[0].length]);
        for (int i = 0; i < mam.getRows(); i++) {
            for (int j = 0; j < mam.getColumns(); j++) {
                mam.cells[i][j] = this.getAt(i, j) + m.getAt(i, j);
            }
        }
        
        return mam;
    }

    /**
     * Retorna a matriz resultante da subtracao de duas matrizes.
     * 
     * @param m - matriz que subtraira a matriz atual.
     * @return matriz resultante da subtracao.
     */
    public Matrix minus(Matrix m) {
        Matrix mam = new Matrix(new double[cells.length][cells[0].length]);
        for (int i = 0; i < mam.getRows(); i++) {
            for (int j = 0; j < mam.getColumns(); j++) {
                mam.cells[i][j] = this.getAt(i, j) - m.getAt(i, j);
            }
        }
        
        return mam;
    }

    /**
     * Retorna a matriz resultante da multiplicacao entre duas matrizes.
     * 
     * @param m - matriz que multiplicara a matriz atual.
     * @return matriz resultante da multiplicacao.
     */
    public Matrix times(Matrix m) {
        Matrix mam = new Matrix(new double[cells.length][m.cells[0].length]);
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < m.getColumns(); j++) {
                for (int k = 0; k < this.getColumns(); k++) {
                    mam.cells[i][j] += this.getAt(i, k) * m.getAt(k, j);
                }
            }
        }
        
        return mam;
    }

    /**
     * Retorna a matriz resultante da multiplicacao de uma matriz por um escalar.
     * 
     * @param e - escalar que multiplicara a matriz atual.
     * @return matriz resultante da multiplicacao.
     */
    public Matrix times(double e) {
        Matrix mam = new Matrix(new double[cells.length][cells[0].length]);
        for (int i = 0; i < mam.getRows(); i++) {
            for (int j = 0; j < mam.getColumns(); j++) {
                mam.cells[i][j] = this.getAt(i, j) * e;
            }
        }
        
        return mam;
    }

    /**
     * Verifica se a matriz e quadrada.
     * 
     * @return true se a matriz for quadrada, false caso contrario.
     */
    public boolean isSquare() {
        return cells.length == cells[0].length;
    }

    /**
     * Verifica se a matriz e simetrica.
     * 
     * @return true se a matriz for simetrica, false caso contrario.
     */
    public boolean isSymmetric() {
        if (!this.isSquare()) return false;

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getAt(i, j) != this.getAt(j, i)) return false;
            }
        }

        return true;
    }

    /**
     * Retorna a matriz transposta.
     *  
     * @return matriz transposta.
     */
    public Matrix getTranspose() {
        Matrix mam = new Matrix(new double[cells[0].length][cells.length]);
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                mam.cells[j][i] = this.getAt(i, j);
            }
        }
        
        return mam;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (double[] line : cells) {
            for (double col : line) {
                str.append(String.format("%10.6f", col));
            }
            str.append('\n');
        }

        return str.toString();
    }
}