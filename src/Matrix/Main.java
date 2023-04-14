package Matrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] A = {
                {2, 4},
                {4, 9}
        };
        int[][] B = {
                {2, 10},
                {5, 9}
        };
        Matrix matrix1 = new Matrix(A);
        matrix1.sum(B);
        System.out.println();
        matrix1.multiplyOnNumber(2);
        System.out.println();
        matrix1.multiplyOnMatrix(B);
        System.out.println();
        System.out.println(Arrays.deepToString(A));
        int[] C = {2, 4, -5, -10, 56};
        System.out.println(Arrays.toString(C));
        System.out.println(Arrays.binarySearch(C, -5));
        Arrays.sort(C);
        System.out.println(Arrays.toString(C));
        int[] D = new int[C.length];
        System.arraycopy(C,2, D, 0, 3);
        System.out.println(Arrays.toString(D));

    }


}
