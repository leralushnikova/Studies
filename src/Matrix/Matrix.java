package Matrix;

public class Matrix {
    private int[][]  matrix;
    private int n, m;
    Matrix(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        this.matrix = matrix;
    }

    public void sum(int[][] matrix) {
        int[][] sum = new int[n][m];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                sum[i][j] = this.matrix[i][j] + matrix[i][j];
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public void multiplyOnNumber(int a) {
        int[][] mult1 = new int[n][m];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                mult1[i][j] = this.matrix[i][j] * a;
                System.out.print(mult1[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public void multiplyOnMatrix(int[][] matrix) {
        int[][] mult2 = new int[n][m];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                mult2[i][j] = this.matrix[i][j] * matrix[i][j];
                System.out.print(mult2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
