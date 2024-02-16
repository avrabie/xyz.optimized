package xyz.optimized.recursivefun.algos.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the PalindromeNumber class's reverseDigits method.
 * These tests cover basic integer reversal scenarios.
 */
public class PalindromeNumberUnitTest {

    @Test
    void testReverseDigits() {
        PalindromeNumber palindrome = new PalindromeNumber();

//        assertEquals(0, palindrome.reverseDigits(0), "Reversing 0 should return 0");
//        assertEquals(1, palindrome.reverseDigits(1), "Reversing 1 should return 1");
        assertEquals(123, palindrome.reverseDigits(321), "Reversing 321 should return 123");
//        assertEquals(54321, palindrome.reverseDigits(12345), "Reversing 12345 should return 54321");
//        assertEquals(123456789, palindrome.reverseDigits(987654321), "Reversing 987654321 should return 123456789");
    }

    @Test
    void testReverseDigitsWithLeadingZeros() {
        PalindromeNumber palindrome = new PalindromeNumber();

        assertEquals(1, palindrome.reverseDigits(100), "Reversing 100 should return 1");
    }
}