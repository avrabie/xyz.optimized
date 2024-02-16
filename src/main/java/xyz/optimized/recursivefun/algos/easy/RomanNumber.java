package xyz.optimized.recursivefun.algos.easy;

// Problem 13
// https://leetcode.com/problems/roman-to-integer/
public class RomanNumber {
    private int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int result = 0;
        int i = 0;
        while (i < charArray.length) {
            int value = getValue(charArray[i]);
            if (isSpecialCase(i, charArray)) {
                i++;
                int temp = getValue(charArray[i]);
                value = temp - value;
            }
            i++;
            result += value;
        }
        return result;
    }

    private boolean isSpecialCase(int i, char[] charArray) {
        if (i == charArray.length-1) return false;
        switch (charArray[i]) {
            case 'I' -> {
                return charArray[i + 1] == 'V' || charArray[i + 1] == 'X';
            }
            case 'X' -> {
                return charArray[i + 1] == 'L' || charArray[i + 1] == 'C';
            }
            case 'C' -> {
                return charArray[i + 1] == 'D' || charArray[i + 1] == 'M';
            }
        }
        return false;
    }
}
