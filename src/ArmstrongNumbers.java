import java.util.*;

/*
Алгоритмы-числа
*/

public class ArmstrongNumbers {
    static int[][] matrix = null;

    public static long[] getNumbers(long N) {
        long[] result = null;
        int bitness = Long.toString(N).length();
        matrix = getNumPowMatrix(bitness);

        System.out.println(getSumOfPowWithBitness(12589l, bitness));
        return result;
    }

    public static int[][] getNumPowMatrix(int bitness) {
        int[][] matrix = new int[10][bitness + 1];
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= bitness; j++) {
                matrix[i][j] = (int) Math.pow(i, j);
            }
        }
        return matrix;
    }

    public static long getSumOfPowWithBitness(long inputNum, int bitness) {
        long result = 0l;
        long reverseInputNum = 0;
        long temp = inputNum;
        while (temp != 0) {
            int digit = (int) (temp % 10);
            reverseInputNum = reverseInputNum * 10 + digit;
            temp /= 10;
        }
        String input = Long.toString(inputNum);
        int i = 0;
        while (result < reverseInputNum && i < input.length()) {
            result += matrix[Integer.parseInt(Character.toString(input.charAt(i)))][bitness];
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
