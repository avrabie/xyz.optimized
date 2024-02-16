package xyz.optimized.recursivefun.algos.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    /**
     * Test class for LongestCommonPrefix.java
     * The LongestCommonPrefix class contains a single method named longestCommonPrefix, 
     * which takes an array of strings as input and returns 
     * the longest common prefix of all the strings. 
     * If there is no common prefix, it returns an empty string.
     */

    //Test when all elements in the array have common prefix
    @Test
    void allElementsHaveCommonPrefix1() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] test = {"flower", "flow", "flight"};
        String result = prefix.longestCommonPrefix(test);
        assertEquals("fl", result);
    }

    // Test when all elements in the array have common prefix
    @Test
    void allElementsHaveCommonPrefix2() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] test = {"aaa", "aaab", "aac"};
        String result = prefix.longestCommonPrefix(test);
        assertEquals("aa", result);
    }

    // Test when no elements in the array have common prefix
    @Test
    void noElementsHaveCommonPrefix() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] test = {"dog", "plow", "flight"};
        String result = prefix.longestCommonPrefix(test);
        assertEquals("", result);
    }

    // Test when single character is common prefix
    @Test
    void singleCharacterCommonPrefix() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] test = {"ab", "ac"};
        String result = prefix.longestCommonPrefix(test);
        assertEquals("a", result);
    }

    //Test when there is only one string in the array
    @Test
    void singleStringArray() {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] test = {"abc"};
        String result = prefix.longestCommonPrefix(test);
        assertEquals("abc", result);
    }
}