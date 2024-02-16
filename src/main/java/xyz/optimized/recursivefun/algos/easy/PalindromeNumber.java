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


    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        return x == reverseDigits(x);
    }

    public int reverseDigits(int r) {
        if (r < 10) return r;
        return (r % 10) * (int) Math.pow(10, get10thPower(r)) + reverseDigits(r / 10);
    }

    public int get10thPower(int r) {
        if (r<0) return get10thPower(r*-1);
        int i = 0;
        while (r / 10 > 0) {
            i++;
            r /= 10;
        }
        return i;
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
