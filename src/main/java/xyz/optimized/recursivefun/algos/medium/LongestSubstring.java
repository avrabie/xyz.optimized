package xyz.optimized.recursivefun.algos.medium;

/*
3. Longest Substring Without Repeating Characters
https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
Recursive Fun Style
 */
public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("xaxbdca"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        for (int i = 0; i < 128; i++) {
            index[i]=-1;
        }

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (index[s.charAt(i)] == -1) {
                index[s.charAt(i)] = i;
                ans++;
            } else {
                return Math.max(ans, lengthOfLongestSubstring(s.substring(index[s.charAt(i)]+1,s.length())));
            }
        }
        return ans;
    }

//    int n = s.length();
//    int ans = 0;
//    int[] index = new int[128];
//        for (int j = 0, i = 0; j < n; j++) {
//        i = Math.max(index[s.charAt(j)], i);
//        ans = Math.max(ans, j - i + 1);
//        index[s.charAt(j)] = j + 1;
//    }
//        return ans;
}
