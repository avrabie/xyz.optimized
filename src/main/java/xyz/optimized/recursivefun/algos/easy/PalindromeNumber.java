package xyz.optimized.recursivefun.algos.easy;

/**
 * Probem 9
 * The PalindromeNumber class checks whether a given number is a palindrome.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindrome = new PalindromeNumber();
        System.out.println(palindrome.isPalindrome(12321));
    }


    public boolean isPalindrome(int num) {
        if (num < 0) num = -1 * num;
        return num == reverseDigits(num);
    }

    private int reverseDigits(int r) {
        if (r == 0) return 0;
        return 10 * reverseDigits(r / 10) + r % 10;
    }

    public int nonRecursiveReverse(int x) {
        int result = 0;
        while (x > 0) {
            result *= 10;
            result += x % 10;
            x = x / 10;
        }
        return result;
    }
}
