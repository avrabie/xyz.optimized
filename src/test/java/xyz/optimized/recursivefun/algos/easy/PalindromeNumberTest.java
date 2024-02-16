package xyz.optimized.recursivefun.algos.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * The PalindromeNumberTest is a class which provides the unit tests for the PalindromeNumber class.
 * It tests whether the isPalindrome method can accurately identify palindromic integers.
 */
public class PalindromeNumberTest {
    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void isPalindrome_for_positive_palindromic_number_should_return_true() {

        int number = 12321;
        boolean actual = palindromeNumber.isPalindrome(number);

        assertTrue(actual);
    }

    @Test
    void isPalindrome_for_positive_non_palindromic_number_should_return_false() {

        int number = 12345;
        boolean actual = palindromeNumber.isPalindrome(number);


        assertFalse(actual);
    }

    @Test
    void isPalindrome_for_negative_number_should_return_false() {

        int number = -12321;
        boolean actual = palindromeNumber.isPalindrome(number);

        assertFalse(actual);
    }

    @Test
    void isPalindrome_for_zero_should_return_true() {

        int number = 0;
        boolean actual = palindromeNumber.isPalindrome(number);

        assertTrue(actual);
    }

    @Test
    void isPalindrome_for_multiple_of_ten_should_return_false() {

        int number = 10;
        boolean actual = palindromeNumber.isPalindrome(number);

        assertFalse(actual);
    }
}