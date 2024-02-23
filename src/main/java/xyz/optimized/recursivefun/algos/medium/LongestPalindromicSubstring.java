package xyz.optimized.recursivefun.algos.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        System.out.println(longestPalindromicSubstring.longestPalindrome("baban"));
    }
    private Map<String, List<Integer>> letters = new HashMap<>();
    public String longestPalindrome(String s) {
        String longest = null;
        fillLetters(s);
        List<String> collect = letters.entrySet().stream()
                .filter(stringListEntry -> stringListEntry.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);

        for (int i = 0; i < collect.size(); i++) {
            List<Integer> indexes = letters.get(collect.get(i));
            System.out.println("Letter "+collect.get(i) +" "+indexes);
            for (int j = 0; j < indexes.size()-1; j++) {
                for (int k = j+1; k < indexes.size(); k++) {
                    if( checkIfPalindrome(s, indexes, j, k)   ){
                        System.out.println("Found palindrome " + s.substring(indexes.get(j),indexes.get(k)+1));
                        if (longest == null){
                            longest = s.substring(indexes.get(j),indexes.get(k)+1);
                        }
                        else {
                            longest = longest.length()>s.substring(indexes.get(j),indexes.get(k)+1).length() ?
                                    longest :
                                    s.substring(indexes.get(j),indexes.get(k)+1);
                        }

                    }
                }

            }
        }
        return longest;
    }

    private boolean checkIfPalindrome(String s, List<Integer> indexes, int j, int k) {
        boolean isPalindrome = true;
        j=indexes.get(j);
        k=indexes.get(k);
        while(j<k) {
            if (s.charAt(j) != s.charAt(k)) {
                isPalindrome = false;
                break;
            }
            j++;
            k--;
        }
        return isPalindrome;
    }

    private void fillLetters(String s) {
        for (int i = 0; i < s.length(); i++) {
            List<Integer> integers = letters.putIfAbsent(String.valueOf(s.charAt(i)), new ArrayList<>(List.of(i)));
            if (integers != null ) {
                integers.add(i);
            }
        }
    }
}
