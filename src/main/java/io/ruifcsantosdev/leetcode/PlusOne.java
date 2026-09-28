package io.ruifcsantosdev.leetcode;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] digits = new int[]{9,9,9};
        int[] res = plusOne(digits);
        System.out.println(Arrays.toString(res));
    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int x = digits[i] + 1;
        if (x > 9) {
            digits[i] = 0;
            while (i > 0) {
                if (digits[i-1] == 9){
                    digits[i-1] = 0;
                } else {
                    digits[i-1] = digits[i-1] + 1;
                    return digits;
                }
                i--;
            }
        } else {
            digits[i] = x;
            return digits;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
