package xyz.optimized.recursivefun.algos.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The PalindromeNumberTests class validates the functionality of the PalindromeNumber class.
 */
public class PalindromeNumberTests {

    @Test
    public void testGetPowerWithZero() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int result = palindromeNumber.getPower(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testGetPowerWithSingleDigit() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int result = palindromeNumber.getPower(5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testGetPowerWithMultipleDigits() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int result = palindromeNumber.getPower(123);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testGetPowerWithNegativeNumber() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int result = palindromeNumber.getPower(-123);
        Assertions.assertEquals(2, result);
    }
}