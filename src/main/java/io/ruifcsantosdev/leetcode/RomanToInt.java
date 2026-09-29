package io.ruifcsantosdev.leetcode;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanDictionary = new HashMap<>();
        romanDictionary.put('I', 1);
        romanDictionary.put('V', 5);
        romanDictionary.put('X', 10);
        romanDictionary.put('L', 50);
        romanDictionary.put('C', 100);
        romanDictionary.put('D', 500);
        romanDictionary.put('M', 1000);
        char[] charArray =  s.toCharArray();
        int res = 0;
        for (int i = 0; i < charArray.length - 1; i++) {
            int current = romanDictionary.get(charArray[i]);
            int next = romanDictionary.get(charArray[i + 1]);
            if (current >= next) {
                res = res + current;
            } else {
                res = res - current;
            }
        }
        return res + romanDictionary.get(charArray[charArray.length - 1]);
    }
}
