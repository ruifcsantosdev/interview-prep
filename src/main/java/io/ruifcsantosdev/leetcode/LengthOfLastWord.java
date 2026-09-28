package io.ruifcsantosdev.leetcode;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(lengthOfLastWord("Hello World"));
    }

    // My solution
    public static int lengthOfLastWord(String s) {
        String[] s1 = s.trim().split(" ");
        return s1[s1.length - 1].length();
    }

    // Best solution
    public static int bestLengthOfLastWord(String s) {
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int length = 0;

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
