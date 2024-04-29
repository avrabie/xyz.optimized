package xyz.optimized.recursivefun.algos.easy;
/*
 Problem 14
 https://leetcode.com/problems/longest-common-prefix/
 very easy
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = checkCommonPrefix(prefix, strs[i]);
            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }

    private String checkCommonPrefix(String prefix, String str) {
        int end = 0;
        for (int i = 0, j = 0; i < prefix.length() && j < str.length(); i++, j++) {
            if (prefix.charAt(i) != str.charAt(j)) break;
            end++;
        }
        return prefix.substring(0,end);
    }

    private int indexOfCommonPrefix(String prefix, String str) {
        int min = Math.min(prefix.length(), str.length());
        int i=0;
        while (i<min && prefix.charAt(i) == str.charAt(i)) {
            i++;
        }

        return i;
    }
}
