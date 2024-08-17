public class Matrix {
    private double[][] cells;

    public Matrix(double[][] c) {
        this.cells = c.clone();
    }

    /**
     * Retornam a quantidade de linhas da matriz.
     * 
     * @return número de linhas da matriz.
     */
    public int getRows() {
        return cells.length;
    }

    /**
     * Retorna a quantidade de colunas da matriz.
     * 
     * @return número de colunas da matriz.
     */
    public int getColumns() {
        return cells[0].length;
    }

    public double getAt(int i, int j) {
        if (i >= cells.length || j >= cells[0].length || i < 0 || j < 0) {
            throw new IllegalArgumentException("Não pode não, malandrão");
        }
        return cells[i][j];
    }

    /**
     * Retorna a matriz resultante da soma de duas matrizes.
     * 
     * @param m - matriz que será somada com a matriz atual.
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
     * Retorna a matriz resultante da subtração de duas matrizes.
     * 
     * @param m - matriz que subtrairá a matriz atual.
     * @return matriz resultante da subtração.
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
     * Retorna a matriz resultante da multiplicação entre duas matrizes.
     * 
     * @param m - matriz que multiplicará a matriz atual.
     * @return matriz resultante da multiplicação.
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
     * Retorna a matriz resultante da multiplicação de uma matriz por um escalar.
     * 
     * @param e - escalar que multiplicará a matriz atual.
     * @return matriz resultante da multiplicação.
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
     * Verifica se a matriz é quadrada.
     * 
     * @return true se a matriz for quadrada, false caso contrário.
     */
    public boolean isSquare() {
        return cells.length == cells[0].length;
    }

    /**
     * Verifica se a matriz é simétrica.
     * 
     * @return true se a matriz for simétrica, false caso contrário.
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
                str.append(String.format("%.6f ", col));
            }
            str.append('\n');
        }

        return str.toString();
    }
}