package io.ruifcsantosdev.leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        String onlyAZ = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(onlyAZ);
        char[] charArray = onlyAZ.toCharArray();
        int lastPosition = charArray.length - 1;
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[lastPosition-i]) {
                return false;
            }
        }
        return true;
    }
}
