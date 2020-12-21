package com.javarush.task.task20.task2025;

import java.math.BigInteger;
import java.util.*;

/*
Алгоритмы-числа
*/

public class Solution {
    static long[][] matrix = null;
    static Set<Long> coolSet = new TreeSet<>();

    public static long[] getNumbers(long N) {

        coolSet.clear();
        long[] result = null;
        if (N <= 0) {
            return new long[0];
        }
        if (N < 10) {
            result = new long[(int) N - 1];
            for (int i = 0; i < N - 1; i++) {
                result[i] = i + 1;
            }
            return result;
        }
        int bitness = Long.toString(N).length();
        matrix = getNumPowMatrix(bitness);
        getCoolNumbers(0, bitness, bitness, "");
        result = new long[coolSet.size() - 1];
        int i = 0;

        for (Long l : coolSet) {
            if (l != 0) {
                result[i] = l;
                i++;
            }
        }

        return result;
    }

    public static long[][] getNumPowMatrix(int bitness) {
        long[][] matrix = new long[10][bitness + 1];
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= bitness; j++) {
                matrix[i][j] = BigInteger.valueOf((long) i).pow(j).longValue();
            }
        }
        return matrix;
    }

    public static long getSumOfPowWithBitness(long inputNum, int bitness) {
        long result = 0l;
        String input = String.valueOf(inputNum);
        int i = 0;
        while (i < input.length()) {
            result += matrix[Integer.parseInt(Character.toString(input.charAt(i)))][bitness];
            i++;
            if (result < 0) {
                break;
            }
        }
        return result;
    }

    public static void getCoolNumbers(int start, int bitness /* input should be length */, int basicBitness, String result) {
        if (bitness == 2) {
            if ((result + 1).replace("^0+", "").length() > basicBitness - 1) {
                return;
            }
            for (int i = start; i < 10; i++) {
                String res = Long.valueOf(result + i).toString();
                int countStart = res.length();
                int countEnd = basicBitness - countStart > 5 ? countStart + 5 : basicBitness;
                for (int j = countStart; j <= countEnd; j++) {
                    long sumOfPow = getSumOfPowWithBitness(Long.parseLong(res), j);
                    long sortedSumOfPow = sortLong(sumOfPow);
                    // shit is near
                    if (Long.parseLong(res) == sortedSumOfPow && String.valueOf(sumOfPow).length() == j) {
                        coolSet.add(sumOfPow);
                    }
                }
            }
            return;
        }
        for (int i = start; i < 10; i++) {
//            result += i;
            getCoolNumbers(i, bitness - 1, basicBitness, result + i);
        }
    }

    public static long sortLong(long l) {
        ArrayList<Integer> list = new ArrayList<>();
        long temp = l;
        do {
            int a = (int) (temp % 10);
            list.add(a);
            temp /= 10;
        } while (temp > 0);
        Collections.sort(list);

        String result = "";
        for (Integer integer : list) {
            result += integer;
        }
        if (result.equals("")) {
            return 0;
        }
        return Long.parseLong(result);
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

//        a = System.currentTimeMillis();
//        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
//        b = System.currentTimeMillis();
//        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
//        System.out.println("time = " + (b - a) / 1000);
    }
}
