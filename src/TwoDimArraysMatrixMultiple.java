import java.util.Arrays;

public class TwoDimArraysMatrixMultiple {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix2[0].length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}
